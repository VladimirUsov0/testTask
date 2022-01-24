package org.example.services.dto;

import lombok.Data;
import org.example.entities.Bank;

import java.util.List;
import java.util.UUID;

@Data
public class ClientDto {

    UUID id;

    String fio;

    String phone;

    String eMail;

    String passportNumber;

    List<Bank> bankList;
}
