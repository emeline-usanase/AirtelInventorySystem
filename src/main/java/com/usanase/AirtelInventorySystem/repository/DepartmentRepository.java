package com.usanase.AirtelInventorySystem.repository;

import com.usanase.AirtelInventorySystem.model.Department;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
	
}