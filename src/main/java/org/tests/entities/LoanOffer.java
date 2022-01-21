package org.tests.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class LoanOffer {
    @Id
    String id;

    @ManyToOne
    Client client;

    @ManyToOne
    Credit credit;

    int creditSum;

    LocalDate paymentDate;

    int paymentSum;

    int paymentCreditBody;

    int paymentCreditPercent;

}
