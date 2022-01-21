package org.tests.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    String id;

    @OneToMany
    List<Credit> creditList;

    @OneToMany
    List<Client> clientList;

}
