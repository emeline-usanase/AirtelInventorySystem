package com.usanase.AirtelInventorySystem.controller;

import com.usanase.AirtelInventorySystem.model.User;
import com.usanase.AirtelInventorySystem.repository.UserRepository;
import com.usanase.AirtelInventorySystem.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private DepartmentRepository deptRepo;

    @GetMapping("/users")
    public String users(Model model){

        model.addAttribute("user", new User());
        model.addAttribute("users", userRepo.findAll());
        model.addAttribute("departments", deptRepo.findAll());

        return "users";
    }

    @PostMapping("/saveUser")
    public String save(@ModelAttribute User user){

        userRepo.save(user);
        return "redirect:/users";
    }
}