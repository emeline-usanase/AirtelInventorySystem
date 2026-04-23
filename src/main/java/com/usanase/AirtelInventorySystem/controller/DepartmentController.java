package com.usanase.AirtelInventorySystem.controller;

import com.usanase.AirtelInventorySystem.model.Department;
import com.usanase.AirtelInventorySystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentRepository repo;

    @GetMapping("/departments")
    public String list(Model model){
        model.addAttribute("departments", repo.findAll());
        model.addAttribute("department", new Department());
        return "departments";
    }

    @PostMapping("/saveDepartment")
    public String save(@ModelAttribute Department department){
        repo.save(department);
        return "redirect:/departments";
    }
}
