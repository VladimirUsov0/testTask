package org.example.services.data;

import org.example.entities.Credit;

import java.util.List;
import java.util.UUID;

public interface CreditService {

    Credit addCredit(Credit credit);

    void delete(UUID id);

    Credit editCredit(Credit credit);

    List<Credit> getAll();

}
