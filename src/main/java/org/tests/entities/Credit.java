package org.tests.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Credit {
    @Id
    String id;

    int limit;

    double percent;

    @ManyToOne
    Bank bank;
}
