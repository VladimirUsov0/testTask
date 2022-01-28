package org.example.controllers;


import org.example.entities.Client;
import org.example.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class MainController {


    @PostMapping("/addClient")
    void addClient(Model model, @RequestAttribute Client client, @Autowired ClientRepo clientRepo) {
        clientRepo.save(client);
    }


    @GetMapping("/clients")
    public String showClients(){
        return "clients";
    }
    @GetMapping("/credits")
    public String showCredits(){
        return "credits";
    }

    @PostMapping("/edit")
    public String edit(){
return "";
    }


}
