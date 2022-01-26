package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "payment_schedule")
@NoArgsConstructor
@Data
public class PaymentSchedule {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id")
    UUID id;

    @ManyToOne
    @JoinColumn(name = "paymentSchedule")
    LoanOffer loanOffer;

    LocalDate paymentDate;

    BigDecimal paymentSum;

    BigDecimal paymentCreditBody;

    BigDecimal paymentCreditPercent;

    public PaymentSchedule(LoanOffer loanOffer, LocalDate paymentDate, BigDecimal paymentSum, BigDecimal paymentCreditBody, BigDecimal paymentCreditPercent) {
        this.loanOffer = loanOffer;
        this.paymentDate = paymentDate;
        this.paymentSum = paymentSum;
        this.paymentCreditBody = paymentCreditBody;
        this.paymentCreditPercent = paymentCreditPercent;
    }
}
