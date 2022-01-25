package org.example.services.data;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.example.repo.BankRepo;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {

    BankRepo bankRepo;

    @Override
    public Bank findById(UUID id) {
        return bankRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

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

    @Override
    public List<Bank> findAllByClient(Client client) {
        return bankRepo.findAllByClientListContaining(client);
    }

    @Override
    public List<Bank> findAllByCredit(Credit credit) {
        return bankRepo.findAllByCreditListContaining(credit);
    }
}
