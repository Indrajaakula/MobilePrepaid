package com.aits.mobileprepaid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";  // Show form
    }

    @PostMapping("/register")
    public String processRegisterForm() {
        // Here you can read submitted data later (with @RequestParam)
        System.out.println("Registration form submitted!");
        
        return "success";  // After submission, go to success.jsp
    }
}