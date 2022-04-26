package com.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketbooking.entities.Reservation;
import com.ticketbooking.entities.Train;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
