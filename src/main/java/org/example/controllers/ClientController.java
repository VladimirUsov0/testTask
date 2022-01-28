package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.services.data.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/clients/")
@AllArgsConstructor
public class ClientController {
    ClientService clientService;



    @GetMapping("/clientList")
    public String showAllBanks(Model model) {
        model.addAttribute("clientService", clientService);
        return "clients/clientList";
    }

    @GetMapping(value = "/edit/{clientId}")
    public String editBank(Model model, @PathVariable("clientId") String id) {
        System.out.println(id);
        model.addAttribute("client", clientService.findById(UUID.fromString(id)));
        return "clients/clientEdit";
    }

    @GetMapping(value = "/delete/{clientId}")
    public String deleteBank(@PathVariable("clientId") String id) {
        clientService.delete(UUID.fromString(id));
        return "clients/clientList";
    }





}
