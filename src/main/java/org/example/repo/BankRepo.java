package org.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entities.Bank;

import java.util.UUID;

@Repository
public interface BankRepo  extends JpaRepository<Bank, UUID> {




}
