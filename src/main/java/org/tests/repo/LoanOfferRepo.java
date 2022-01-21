package org.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tests.entities.LoanOffer;

@Repository
public interface LoanOfferRepo extends JpaRepository<LoanOffer, String> {

}
