package org.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tests.entities.Bank;

@Repository
public interface BankRepo  extends JpaRepository<Bank,String> {




}
