package org.example.services.dto;

import lombok.Data;
import org.example.entities.Bank;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
public class CreditDto {
    UUID id;

    BigDecimal limit;

    float percent;

    List<Bank> bankList;

}
