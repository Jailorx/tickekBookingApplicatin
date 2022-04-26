package com.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketbooking.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
