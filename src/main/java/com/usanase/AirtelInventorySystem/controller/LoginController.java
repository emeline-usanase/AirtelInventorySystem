package com.usanase.AirtelInventorySystem.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if ((username.equals("24RP00227") && password.equals("24RP107722")) ||
            (username.equals("24RP107722") && password.equals("24RP00227"))) {
            return "redirect:/dashboard";
        }

        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}