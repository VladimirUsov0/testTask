package org.tests.entities;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "client")
public class Client {

    @Id
    UUID id;
    @Column(name = "fio",unique = true, nullable = false)
    String fio;
    @Column(name = "email",unique = true, nullable = false)
    String eMail;
    @NaturalId
    @Column(name = "passportNum",unique = true, nullable = false)
    String passportNumber;


    @ManyToOne
    Bank bank;


}
