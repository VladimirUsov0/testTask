package org.tests.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tests.repo.ClientRepo;

@Component
public class CreditProcessor {

    @Autowired
    ClientRepo clientRepo;

    void dd(){

    }

}
