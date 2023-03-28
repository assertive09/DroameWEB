package com.droame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.droame.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer>{

	Location findById(int id);
	@Query("select l from Location l")
	List <Location> getAllLocations(); 
	
}
