package com.ticketbooking.services;

import com.ticketbooking.dto.ReservationRequest;
import com.ticketbooking.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookTrain(ReservationRequest request);

}
