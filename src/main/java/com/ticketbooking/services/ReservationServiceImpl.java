package com.ticketbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.dto.ReservationRequest;
import com.ticketbooking.entities.Passenger;
import com.ticketbooking.entities.Reservation;
import com.ticketbooking.entities.Train;
import com.ticketbooking.repository.PassengerRepository;
import com.ticketbooking.repository.ReservationRepository;
import com.ticketbooking.repository.TrainRepository;


@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	TrainRepository trainRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;

	
	
	@Override
	public Reservation bookTrain(ReservationRequest request) {
		//Make Payment
		
		long trainId=request.getTrainId();
		Train train=trainRepository.findById(trainId).get();
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		
		Passenger savedPassenger=passengerRepository.save(passenger);
		
		Reservation reservation=new Reservation();
		reservation.setTrain(train);
		reservation.setPassenger(savedPassenger);
		
		Reservation savedReservation=reservationRepository.save(reservation);

		
		
		
		
		return savedReservation;
	}

}
