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

        double mIR = monthIR(loanOffer);
        double creditIRMonth = Math.pow(1 + mIR, months);
        BigDecimal totalSum = loanOffer.getTotalSum();

        BigDecimal totalMoney = (BigDecimal.valueOf(months).
                multiply(totalSum).
                multiply(BigDecimal.valueOf(mIR)).
                multiply(BigDecimal.valueOf(creditIRMonth))).
                divide(BigDecimal.valueOf((creditIRMonth - 1)), 2, RoundingMode.HALF_UP);
        BigDecimal totalInterests = totalMoney.subtract(totalSum).setScale(2, RoundingMode.HALF_UP);

        BigDecimal loanBalance = loanOffer.getTotalSum();

        for (int i = 0; i < months; i++) {
            LocalDate paymentDate = loanOffer.getDateOfIssue().plusMonths(i+1);

            BigDecimal paymentCreditPercent = loanBalance.multiply(BigDecimal.valueOf(mIR)).
                    setScale(2, RoundingMode.HALF_UP);
            BigDecimal paymentCreditBody = totalMoney.divide(BigDecimal.valueOf(months), 2, RoundingMode.HALF_UP);
            BigDecimal paymentSum = paymentCreditBody.add(paymentCreditPercent)
                    .setScale(2, RoundingMode.HALF_UP);

            loanBalance = loanBalance.subtract(paymentCreditBody);

            PaymentSchedule ps = new PaymentSchedule(loanOffer, paymentDate, paymentSum, paymentCreditBody, paymentCreditPercent);
            result.add(ps);
        }

        return result;
    }

    //monthInterestRate
    private double monthIR(LoanOffer loanOffer) {
        double percent = Double.parseDouble(Float.toString(loanOffer.getCredit().getPercent()));
        return percent / 100 / 12;
    }

}
