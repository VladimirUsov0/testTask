package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.services.data.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
@RequestMapping("/banks/")
@AllArgsConstructor
public class BankController {

    BankService bankService;


    @GetMapping("/bankList")
    public String showAllBanks(Model model) {
        model.addAttribute("bankService", bankService);
        return "banks/BankList";
    }

    @PostMapping(value = "/edit")
    public String editBank(Model model, @RequestParam("bankId") String id) {
        System.out.println(id);
        model.addAttribute("bank", bankService.findById(UUID.fromString(id)));
        return "banks/BankEdit";
    }

    @PostMapping(value = "/delete/")
    public String deleteBank(@RequestParam("bankId") String id) {
        bankService.delete(UUID.fromString(id));
        return "banks/BankList";
    }
    @PostMapping(value = "/addNew")
    public String addNewBank(Model model){
        model.addAttribute("bank",new Bank());
        return "banks/BankEdit";
    }

}
