package com.example.airlines.models;

import javax.persistence.*;

@Entity
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getAirportId() {
        return AirportId;
    }

    public void setAirportId(long airportId) {
        AirportId = airportId;
    }

    @ManyToOne
    private long AirportId;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    private int fuel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
