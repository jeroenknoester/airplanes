package com.example.airlines.controllers;

import com.example.airlines.models.Airplane;
import com.example.airlines.models.Airport;
import com.example.airlines.models.Writer;
import com.example.airlines.repositories.AirplaneRepository;
import com.example.airlines.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/airport/")
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;


    @Autowired
    private AirplaneRepository airplaneRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Airport> getAll(){
        return airportRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Airport create(@RequestBody Airport airport)
    {
        return airportRepository.save(airport);
    }
}
