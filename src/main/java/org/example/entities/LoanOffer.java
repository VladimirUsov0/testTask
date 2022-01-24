package org.example.entities;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "loan_offer")
@NoArgsConstructor
public class LoanOffer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @ManyToOne
    Client client;

    @ManyToOne
    Credit credit;

    @Column(name = "credit_sum")
    BigDecimal creditSum;

    @OneToMany(mappedBy = "loanOffer")
    List<PaymentSchedule> paymentSchedule;


    public LoanOffer(Client client, Credit credit) {
        this.client = client;
        this.credit = credit;
    }
}
