package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name= "credit")
@NoArgsConstructor
@Data
public class Credit {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id")
    UUID id;

    @Column(name= "limit")
    BigDecimal limit;
    @Column(name= "percent")
    float percent;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
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
