package com.usanase.AirtelInventorySystem.controller;

import com.usanase.AirtelInventorySystem.model.Device;
import com.usanase.AirtelInventorySystem.repository.DeviceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeviceController {

    @Autowired
    private DeviceRepository repo;

    @GetMapping("/devices")
    public String devices(Model model){

        model.addAttribute("device", new Device());
        model.addAttribute("devices", repo.findAll());

        return "devices";
    }

    @PostMapping("/saveDevice")
    public String save(@ModelAttribute Device device){

        repo.save(device);

        return "redirect:/devices";
    }
}