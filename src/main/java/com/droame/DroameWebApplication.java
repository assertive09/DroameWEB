package com.droame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.droame.entities.Booking;
import com.droame.entities.Customer;
import com.droame.entities.Drone;
import com.droame.entities.Location;
import com.droame.repository.CustomerRepository;


@SpringBootApplication
public class DroameWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(DroameWebApplication.class, args);
	
	}
}
