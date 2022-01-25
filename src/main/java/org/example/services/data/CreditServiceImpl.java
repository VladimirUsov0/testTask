package org.example.services.data;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.entities.Credit;
import org.example.entities.LoanOffer;
import org.example.repo.CreditRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CreditServiceImpl implements CreditService{

    CreditRepo creditRepo;

    @Override
    public Credit addCredit(Credit credit) {
        Credit credit1 = creditRepo.save(credit);
        return credit1;
    }

    @Override
    public void delete(UUID id) {
        creditRepo.deleteById(id);
    }

    @Override
    public Credit editCredit(Credit credit) {
        return creditRepo.saveAndFlush(credit);
    }

    @Override
    public List<Credit> getAll() {
        return creditRepo.findAll();
    }

    @Override
    public List<Credit> findByLoanOffer(LoanOffer loanOffer) {
        return creditRepo.findAllByLoanOfferListContaining(loanOffer);
    }

    @Override
    public List<Credit> findByBank(Bank bank) {
        return creditRepo.findAllByBankListContaining(bank);
    }
}
