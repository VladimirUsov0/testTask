package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "bank")
@Data
public class Bank {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    UUID id;
    @ManyToMany(mappedBy = "bankList", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
    List<Credit> creditList;
    @ManyToMany(mappedBy = "bankList", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
    List<Client> clientList;

}
