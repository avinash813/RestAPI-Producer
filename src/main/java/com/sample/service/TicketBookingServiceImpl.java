package com.sample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.ITicketRepo;
import com.sample.pojo.Passenger;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService {

	@Autowired
	private ITicketRepo repo;
	
	@Override
	public Passenger registerPassenger(Passenger passenger) 
	{
		return repo.save(passenger);
		
	}

	@Override
	public Passenger getPassengerInfo(Integer pid) 
	{
		Optional<Passenger> optional = repo.findById(pid);
		return optional.get();
	}

}
