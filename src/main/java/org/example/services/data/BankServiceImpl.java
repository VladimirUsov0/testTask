package org.example.services.data;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.example.repo.BankRepo;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {

    BankRepo bankRepo;

    EntityManager em;


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
        Bank bank = em.find(Bank.class, id);
        for (Client client : bank.getClientList()) {
            //remove bank don't remove client
            if (client.getBankList().size() != 0) {
                client.getBankList().remove(bank);
            }
        }
        for (Credit credit : bank.getCreditList()) {
            //when removing bank remove credit if they had no other related bank
            if (credit.getBankList().size() == 0) {
                em.remove(credit);
            } else {
                credit.getBankList().remove(bank);
            }
        }
        em.remove(bank);
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

    @Override
    public void detachClient(UUID id, Client client) {
        Bank bank = em.find(Bank.class, id);
        bank.getClientList().removeIf((x) -> x.equals(client));
        client.getBankList().removeIf((x) -> x.equals(bank));
    }

    @Override
    public void detachCredit(UUID id, Credit credit) {
        Bank bank = em.find(Bank.class, id);
        bank.getCreditList().removeIf((x) -> x.equals(credit));
        credit.getBankList().removeIf((x) -> x.equals(bank));
    }

    @Override
    public Client appendClient(UUID id, Client client) {
        Bank bank = em.find(Bank.class, id);
        bank.getClientList().add(client);
        client.getBankList().add(bank);
        return client;
    }

    @Override
    public Credit appendCredit(UUID id, Credit credit) {
        Bank bank = em.find(Bank.class, id);
        bank.getCreditList().add(credit);
        credit.getBankList().add(bank);
        return credit;
    }
}
