package com.example.spring_boot_blog_app.controllers;

import com.example.spring_boot_blog_app.models.Account;
import com.example.spring_boot_blog_app.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistorController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/registor")
    public String getRegistorPage(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "registor";
    }

    @PostMapping("/registor")
    public String registorNewUser(@ModelAttribute Account account) {
        accountService.save(account);

        return "redirect:/login";
    }
}
