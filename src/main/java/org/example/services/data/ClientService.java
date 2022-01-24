package org.example.services.data;

import org.example.entities.Client;

import java.util.List;
import java.util.UUID;

public interface ClientService {
    Client addClient(Client bank);

    void delete(UUID id);

    Client getByFIO(String name);

    Client getByPhone(String name);

    Client getByEmail(String name);

    Client getByPassportNumber(String name);

    Client editClient(Client bank);

    List<Client> getAll();
}