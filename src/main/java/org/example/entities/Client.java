package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "client")
@Data
public class Client {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;
    @Column(name = "fio", unique = true, nullable = false)
    String fio;
    @Column(name = "email", unique = true, nullable = false)
    String eMail;
    @NaturalId
    @Column(name = "passportNumber", unique = true, nullable = false)
    String passportNumber;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "bank_client",
            joinColumns = {@JoinColumn(name = "client")},
            inverseJoinColumns = {@JoinColumn(name = "bank")}
    )
    List<Bank> bankList;

    public Client(String fio, String eMail, String passportNumber) {
        this.fio = fio;
        this.eMail = eMail;
        this.passportNumber = passportNumber;
    }
}
