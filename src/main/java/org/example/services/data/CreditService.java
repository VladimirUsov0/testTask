package org.example.services.data;

import org.example.entities.Bank;
import org.example.entities.Credit;
import org.example.entities.LoanOffer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface CreditService {

    Credit findById(UUID id);

    Credit addCredit(Credit credit);

    @Transactional
    void delete(UUID id);

    Credit editCredit(Credit credit);

    List<Credit> getAll();

    List<Credit> findByLoanOffer(LoanOffer loanOffer);

    List<Credit> findByBank(Bank bank);


}
