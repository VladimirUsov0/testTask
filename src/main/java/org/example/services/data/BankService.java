package org.example.services.data;

import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface BankService {
    Bank findById(UUID id);

    Bank addBank(Bank bank);

    @Transactional
    void delete(UUID id);

    Bank editBank(Bank bank);

    List<Bank> getAll();

    List<Bank> findAllByClient(Client client);

    List<Bank> findAllByCredit(Credit credit);
    @Transactional
    void detachClient(UUID id, Client client);
    @Transactional
    void detachCredit(UUID id, Credit credit);
    @Transactional
    Client appendClient(UUID id, Client client);
    @Transactional
    Credit appendCredit(UUID id, Credit credit);

}
