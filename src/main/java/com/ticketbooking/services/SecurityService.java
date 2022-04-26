package com.ticketbooking.services;

import org.springframework.context.annotation.Bean;

public interface SecurityService {
	

	boolean login(String username,String password);

}
