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


        int months = loanOffer.getPeriodMonths();

        List<PaymentSchedule> result = new ArrayList<>(months + 1);

        //меячная процентная ставка
        double mIR = monthIR(loanOffer);
        double creditIRMonth = Math.pow(1 + mIR, months);
        //сумма кредита
        BigDecimal totalSum = loanOffer.getTotalSum();
        //общая сумма погашения
        BigDecimal totalMoney = (BigDecimal.valueOf(months).
                multiply(totalSum).
                multiply(BigDecimal.valueOf(mIR)).
                multiply(BigDecimal.valueOf(creditIRMonth))).
                divide(BigDecimal.valueOf((creditIRMonth - 1)), 2, RoundingMode.HALF_EVEN);
        System.out.println(totalMoney);
        BigDecimal totalInterests = totalMoney.subtract(totalSum).setScale(2, RoundingMode.HALF_EVEN);
        //осталось к выплате
        BigDecimal loanBalance = totalSum;

        for (int i = 0; i < months; i++) {
            LocalDate paymentDate = loanOffer.getDateOfIssue().plusMonths(i+1);
            System.out.println(totalMoney);
            BigDecimal paymentCreditPercent = loanBalance.multiply(BigDecimal.valueOf(mIR)).
                    setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal paymentCreditBody = totalMoney.divide(BigDecimal.valueOf(months), 2, RoundingMode.HALF_EVEN);
            BigDecimal paymentSum = paymentCreditBody.add(paymentCreditPercent)
                    .setScale(2, RoundingMode.HALF_EVEN);

            loanBalance = loanBalance.subtract(paymentCreditBody);

            PaymentSchedule ps = new PaymentSchedule(loanOffer, paymentDate, paymentSum, paymentCreditBody, paymentCreditPercent);
            result.add(ps);
        }

        return result;
    }

    //monthInterestRate
    private double monthIR(LoanOffer loanOffer) {
        double percent = loanOffer.getCredit().getPercent();
        return percent / 100d / 12d;
//        return 0.015416d;
    }

}
