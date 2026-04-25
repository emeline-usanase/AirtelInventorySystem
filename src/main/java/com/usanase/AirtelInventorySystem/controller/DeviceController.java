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

    // Show all devices
    @GetMapping("/devices")
    public String devices(Model model) {

        model.addAttribute("device", new Device());
        model.addAttribute("devices", repo.findAll());

        return "devices";
    }

    // Save device (create or update)
    @PostMapping("/saveDevice")
    public String save(@ModelAttribute Device device) {

        repo.save(device);
        return "redirect:/devices";
    }

    // Delete device
    @GetMapping("/deleteDevice/{id}")
    public String deleteDevice(@PathVariable Long id) {

        repo.deleteById(id);
        return "redirect:/devices";
    }

    // Edit device
    @GetMapping("/editDevice/{id}")
    public String editDevice(@PathVariable Long id, Model model) {

        Device device = repo.findById(id).orElse(null);

        model.addAttribute("device", device != null ? device : new Device());
        model.addAttribute("devices", repo.findAll());

        return "devices";
    }
}