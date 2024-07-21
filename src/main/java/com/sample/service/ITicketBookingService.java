package com.sample.service;

import com.sample.pojo.Passenger;

public interface ITicketBookingService 
{
	public Passenger registerPassenger(Passenger passenger);
	public Passenger getPassengerInfo(Integer pid);

}
