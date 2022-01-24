package org.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entities.Credit;

import java.util.UUID;

@Repository
public interface CreditRepo extends JpaRepository<Credit, UUID> {



}
