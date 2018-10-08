package com.example.airlines.controllers;

import com.example.airlines.models.Airplane;
import com.example.airlines.models.Airport;
import com.example.airlines.repositories.AirplaneRepository;
import com.example.airlines.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/airplane/")
public class AirplaneController {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Autowired
    private AirportRepository airportRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Airplane> getAll(){
        return airplaneRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Airplane create(@RequestBody Airplane airplane)
    {
        Optional<Airport> newAirport = airportRepository.findById(airplane.getAirport().getId());

        if(!newAirport.isPresent()){
            throw new RuntimeException();
        }
        return airplaneRepository.save(airplane);
    }
}