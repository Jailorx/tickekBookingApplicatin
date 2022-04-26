package com.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.dto.ReservationUpdateRequest;
import com.ticketbooking.entities.Reservation;
import com.ticketbooking.repository.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRESTController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request)
	{
		Reservation reservation=reservationRepository.findById(request.getId()).get();
		
		Reservation updatedReservation=reservationRepository.save(reservation);
		return updatedReservation;
	}

}
