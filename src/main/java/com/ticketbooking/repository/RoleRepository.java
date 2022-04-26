package com.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketbooking.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

