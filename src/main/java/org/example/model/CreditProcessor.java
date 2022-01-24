package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.repo.ClientRepo;

@Component
public class CreditProcessor {


    @Autowired
    ClientRepo clientRepo;

    void dd(){

    }

}
