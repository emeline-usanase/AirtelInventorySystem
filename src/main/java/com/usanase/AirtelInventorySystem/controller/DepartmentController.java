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

    // Show departments page
    @GetMapping("/departments")
    public String list(Model model) {

        model.addAttribute("departments", repo.findAll());
        model.addAttribute("department", new Department());

        return "departments";
    }

    // Save department
    @PostMapping("/saveDepartment")
    public String save(@ModelAttribute Department department) {

        repo.save(department);

        return "redirect:/departments";
    }

    // Edit department
    @GetMapping("/editDepartment/{id}")
    public String edit(@PathVariable int id, Model model) {

        Department department = repo.findById(id).orElse(new Department());

        model.addAttribute("department", department);
        model.addAttribute("departments", repo.findAll());

        return "departments";
    }

    // Delete department
    @GetMapping("/deleteDepartment/{id}")
    public String delete(@PathVariable int id) {

        repo.deleteById(id);

        return "redirect:/departments";
    }
}