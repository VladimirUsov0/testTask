package org.example.entities;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name= "credit")
@NoArgsConstructor
public class Credit {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @Column(name= "limit")
    BigDecimal limit;
    @Column(name= "percent")
    float percent;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "bank_credit",
            joinColumns = {@JoinColumn(name = "credit")},
            inverseJoinColumns = {@JoinColumn(name = "bank")}
    )
    List<Bank> bankList;

    @OneToMany(mappedBy = "credit")
    List<LoanOffer> loanOfferList;

    public Credit(BigDecimal limit, float percent) {
        this.limit = limit;
        this.percent = percent;
    }
}
