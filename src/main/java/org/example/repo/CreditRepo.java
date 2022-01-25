package org.example.repo;

import org.example.entities.Bank;
import org.example.entities.Credit;
import org.example.entities.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CreditRepo extends JpaRepository<Credit, UUID> {


    List<Credit> findAllByLoanOfferListContaining(LoanOffer loanOffer);

    List<Credit> findAllByBankListContaining(Bank bank);

}
