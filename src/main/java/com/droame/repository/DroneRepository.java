package com.droame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.droame.entities.Drone;


public interface DroneRepository extends CrudRepository<Drone, Integer> {


	Drone findById(int id);
	@Query("select d from Drone d")
	List <Drone> getAllDrones(); 
}
