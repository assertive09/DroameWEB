package com.droame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.droame.entities.Customer;

public interface CustomerRepository extends CrudRepository <Customer , Integer>{
    
	Customer findById(int id);
	@Query("select c from Customer c")
	List <Customer> getAllCustomer(); 
	
	
}
