package com.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.pojo.Passenger;

public interface ITicketRepo extends JpaRepository<Passenger, Integer> 
{

}
