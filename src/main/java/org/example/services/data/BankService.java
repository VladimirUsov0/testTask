package org.example.services.data;

import org.example.entities.Bank;

import java.util.List;
import java.util.UUID;

public interface BankService {
    Bank addBank(Bank bank);
    void delete(UUID id);
    Bank editBank(Bank bank);
    List<Bank> getAll();
}
