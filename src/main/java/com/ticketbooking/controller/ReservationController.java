package com.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticketbooking.dto.ReservationRequest;
import com.ticketbooking.entities.Reservation;
import com.ticketbooking.entities.Train;
import com.ticketbooking.repository.TrainRepository;
import com.ticketbooking.services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	TrainRepository trainRepository;
	
	@Autowired
	ReservationService reservationService;
	

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("trainId")long trainId,ModelMap modelMap)
	{
		Train train=trainRepository.findById(trainId).get();
		modelMap.addAttribute("train", train);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation",method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request,ModelMap modelMap)
	{
		Reservation reservation=reservationService.bookTrain(request);
		modelMap.addAttribute("msg", "RESERVATION CREATED SUCCESSFULLY AND YOUR ID IS "+ reservation.getId());
		return "reservationConfirmation";
	}
}
