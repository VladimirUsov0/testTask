package org.example.entities;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
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

    @OneToOne
    PaymentSchedule paymentSchedule;


    public LoanOffer(Client client, Credit credit) {
        this.client = client;
        this.credit = credit;
    }
}
