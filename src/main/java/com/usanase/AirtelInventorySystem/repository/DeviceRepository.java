package com.usanase.AirtelInventorySystem.repository;

import com.usanase.AirtelInventorySystem.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}