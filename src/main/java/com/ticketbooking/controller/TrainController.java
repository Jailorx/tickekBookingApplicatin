package com.ticketbooking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticketbooking.entities.Train;
import com.ticketbooking.repository.TrainRepository;

@Controller
public class TrainController {
	
	@Autowired
	TrainRepository trainRepository;
	
	@RequestMapping("/findTrains")
	public String findTrains(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("date") @DateTimeFormat(pattern="dd-MM-yyyy")Date date,ModelMap modelMap)
	{
		List<Train> trains=trainRepository.findTrains(from,to,date);
		modelMap.addAttribute("trains", trains);
		return "displayTrains";
	}

	@RequestMapping("admin/addTrainPage")
	public String showAddTrainPage()
	{
		return "admin/addTrain";
	}
	
	@RequestMapping(value="addTrain", method=RequestMethod.POST)
	public String add(@ModelAttribute("train") Train train)
	{
		
		trainRepository.save(train);
		return "added";
		
		
	}
	
	@RequestMapping("admin/showTrains")
	public String showTrains(ModelMap modelMap)
	{
		List<Train> trains=trainRepository.showTrains();
		modelMap.addAttribute("trains",trains);
		return "admin/showAllTrains";
	}
}
