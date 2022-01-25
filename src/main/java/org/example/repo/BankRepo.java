package org.example.repo;

import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BankRepo extends JpaRepository<Bank, UUID> {


    List<Bank> findAllByClientListContaining(Client client);

    List<Bank> findAllByCreditListContaining(Credit credit);
}
