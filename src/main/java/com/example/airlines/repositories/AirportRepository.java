package com.example.airlines.repositories;

import com.example.airlines.models.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {
//    Writer findOneByName(String name);
}
