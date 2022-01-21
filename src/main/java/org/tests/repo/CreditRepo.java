package org.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tests.entities.Credit;

@Repository
public interface CreditRepo extends JpaRepository<Credit,String> {
}
