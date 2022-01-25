package org.example.repo;

import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepo extends JpaRepository<Client, UUID> {

    Optional<Client> findByFioEquals(String fio);

    Optional<Client> findClientByPhoneEquals(String phone);

    Optional<Client> findClientByEmailEquals(String email);

    Optional<Client> findClientByPassportNumberEquals(String passportNumber);

    List<Client> findAllByBankListContaining(Bank bank);

    List<Client> findAllByLoanOfferListContaining(LoanOffer loanOffer);
}
