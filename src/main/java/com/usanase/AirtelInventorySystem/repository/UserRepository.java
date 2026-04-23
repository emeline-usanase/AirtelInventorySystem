package com.usanase.AirtelInventorySystem.repository;

import com.usanase.AirtelInventorySystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
