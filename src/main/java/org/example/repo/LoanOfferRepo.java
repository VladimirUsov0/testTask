package org.example.repo;

import org.example.entities.Client;
import org.example.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entities.LoanOffer;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface LoanOfferRepo extends JpaRepository<LoanOffer, UUID> {

    Optional<LoanOffer> findByClientEquals(Client client);
    Optional<LoanOffer> findByCreditEquals(Credit credit);
}
