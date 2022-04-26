package com.ticketbooking.dto;

public class ReservationUpdateRequest {
	
	private long id;
	private boolean checkedIn;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

}
