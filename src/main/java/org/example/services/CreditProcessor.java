package org.example.services;

import lombok.AllArgsConstructor;
import org.example.entities.LoanOffer;
import org.example.entities.PaymentSchedule;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class CreditProcessor {


    public List<PaymentSchedule> countAnnuitet(LoanOffer loanOffer) {

        final int months = loanOffer.getPeriodMonths();

        List<PaymentSchedule> result = new ArrayList<>(months);

        //monthly interest rate
        final double mIR = monthIR(loanOffer);
        final double pow = Math.pow(1 + mIR, months);
        //total loan amount
        BigDecimal totalSum = loanOffer.getTotalSum();

        //сумма ежемесячной выплаты
        /*
         * total monthly payment formula:
         * TS*(mIR+(mIR/(pow(1+mIR,M)-1)))
         * where TS - total loan amount
         * mIR - monthly interest rate
         * M - loan period in months
         * */
        BigDecimal totalMonthPay = totalSum.
                multiply(BigDecimal.valueOf(mIR).
                        add(BigDecimal.valueOf(mIR).
                                divide(BigDecimal.valueOf(pow)
                                        .subtract(BigDecimal.ONE), 12, RoundingMode.HALF_UP)));

        //left to pay
        BigDecimal loanBalance = totalSum;

        for (int i = 0; i < months; i++) {
            // months iter
            LocalDate paymentDate = loanOffer.getDateOfIssue().plusMonths(i + 1);
            /*
             * Percentage part as LP * mIR
             * where LP - left to pay and mIR - monthly interest rate
             */
            BigDecimal paymentCreditPercent = loanBalance.multiply(BigDecimal.valueOf(mIR));
            /*
             * loan body as TMP - PP
             * where TMP - total monthly payment and PP - Percentage part
             * */
            BigDecimal paymentCreditBody = totalMonthPay.subtract(paymentCreditPercent).setScale(12, RoundingMode.HALF_UP);

            /*
             *  the loan balance is calculated at each iteration as
             *  loan balance - amount of the loan body last month
             * */
            loanBalance = loanBalance.subtract(paymentCreditBody);

            PaymentSchedule ps = new PaymentSchedule(loanOffer,
                    paymentDate,
                    totalMonthPay.setScale(2, RoundingMode.HALF_EVEN),
                    paymentCreditBody.setScale(2, RoundingMode.HALF_EVEN),
                    paymentCreditPercent.setScale(2, RoundingMode.HALF_EVEN));
            result.add(ps);
        }

        return result;
    }

    //monthInterestRate
    private double monthIR(LoanOffer loanOffer) {
        double percent = loanOffer.getCredit().getPercent();
        return percent / 100d / 12d;
    }

}
