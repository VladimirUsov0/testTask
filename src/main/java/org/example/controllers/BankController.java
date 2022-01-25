package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.services.data.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/edit/{bankId}")
    public String editBank(Model model, @PathVariable("bankId") String id) {
        System.out.println(id);
        model.addAttribute("bank", bankService.findById(UUID.fromString(id)));
        return "banks/BankEdit";
    }

    @GetMapping(value = "/delete/{bankId}")
    public String deleteBank(@PathVariable("bankId") String id) {
        bankService.delete(UUID.fromString(id));
        return "banks/BankList";
    }

}
