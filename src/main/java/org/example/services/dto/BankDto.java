package org.example.services.dto;

import lombok.Data;
import org.example.entities.Client;
import org.example.entities.Credit;

import java.util.List;
import java.util.UUID;

@Data
public class BankDto {

    UUID id;

    List<Credit> creditList;

    List<Client> clientList;
}
