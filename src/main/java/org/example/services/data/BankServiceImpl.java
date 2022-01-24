package org.example.services.data;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.repo.BankRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {

    BankRepo bankRepo;

    @Override
    public Bank addBank(Bank bank) {
        Bank bank1 = bankRepo.save(bank);
        return bank1;
    }

    @Override
    public void delete(UUID id) {
        bankRepo.deleteById(id);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepo.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepo.findAll();
    }
}
