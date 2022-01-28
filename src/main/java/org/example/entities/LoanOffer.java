package org.example.entities;

import lombok.Data;
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
@Data
public class LoanOffer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id")
    UUID id;

    @ManyToOne
    Client client;

    @ManyToOne
    Credit credit;

    @OneToMany(mappedBy = "loanOffer")
    List<PaymentSchedule> paymentSchedule;

    @Column(name = "total_sum")
    BigDecimal totalSum;

    @Column(name = "date_of_issue")
    LocalDate dateOfIssue;
    @Column(name = "first_pay")
    BigDecimal firstPay;
    @Column(name = "period_months")
    Integer periodMonths;


    public LoanOffer(Client client,Credit credit,BigDecimal totalSum,LocalDate  dateOfIssue,BigDecimal firstPay,int periodMonths) {
        this.client = client;
        this.credit = credit;
        this.totalSum = totalSum;
        this.dateOfIssue = dateOfIssue;
        this.firstPay = firstPay;
        this.periodMonths = periodMonths;
    }
}
