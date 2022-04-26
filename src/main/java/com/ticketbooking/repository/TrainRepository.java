package com.ticketbooking.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ticketbooking.entities.Train;


public interface TrainRepository extends JpaRepository<Train, Long> {

	@Query("from Train where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Train> findTrains(@Param("departureCity")String from, @Param("arrivalCity")String to, @Param("dateOfDeparture")Date date);
	
	@Query("from Train")
	List<Train> showTrains();
	

}
