package org.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tests.entities.Client;

public interface ClientRepo extends JpaRepository<Client,String> {
}
