package org.example.services.dto;

import lombok.Data;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.example.entities.PaymentSchedule;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
public class LoanOfferDto {
    UUID id;

    Client client;

    Credit credit;

    BigDecimal creditSum;

    List<PaymentSchedule> paymentSchedule;
}
