package org.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepo extends JpaRepository<Client, UUID> {


}
