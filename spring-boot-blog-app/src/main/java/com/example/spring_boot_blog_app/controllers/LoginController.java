package com.example.spring_boot_blog_app.controllers;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getlogin() {
        return "login";
    }
}
