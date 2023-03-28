package com.droame.repository;

import org.springframework.data.repository.CrudRepository;

import com.droame.entities.Booking;

public interface BookingRepository extends CrudRepository<Booking,Integer> {

	
}
