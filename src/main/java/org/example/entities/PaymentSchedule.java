package org.example.entities;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "payment_schedule")
@NoArgsConstructor
public class PaymentSchedule {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @ManyToOne
    @JoinColumn(name = "paymentSchedule")
    LoanOffer loanOffer;

    LocalDate paymentDate;

    BigDecimal paymentSum;

    BigDecimal paymentCreditBody;

    BigDecimal paymentCreditPercent;

}
