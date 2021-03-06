package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "client")
@Getter
public class Client {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id")
    UUID id;
    @Column(name = "fio", unique = true, nullable = false)
    @NotBlank(message = "fio must be not blank")
    String fio;
    @Column(name = "phone", unique = true, nullable = false)
    @NotBlank(message = "phone must be not blank")
    String phone;
    @Column(name = "email", unique = true, nullable = false)
    @NotBlank(message = "email must be not blank")
    String email;
    @NaturalId
    @Column(name = "passportNumber", unique = true, nullable = false)
    @NotBlank(message = "passport number must be not blank")
    String passportNumber;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "bank_client",
            joinColumns = {@JoinColumn(name = "client")},
            inverseJoinColumns = {@JoinColumn(name = "bank")}
    )
    List<Bank> bankList;

    @OneToMany(mappedBy = "client")
    List<LoanOffer> loanOfferList;

    @Transient
    UUID clientID;

    public Client(String fio, String email, String phone, String passportNumber) {
        this.fio = fio;
        this.phone = phone;
        this.email = email;
        this.passportNumber = passportNumber;
    }
}
