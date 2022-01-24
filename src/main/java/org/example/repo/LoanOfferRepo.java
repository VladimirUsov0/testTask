package org.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entities.LoanOffer;

import java.util.UUID;

@Repository
public interface LoanOfferRepo extends JpaRepository<LoanOffer, UUID> {

}
