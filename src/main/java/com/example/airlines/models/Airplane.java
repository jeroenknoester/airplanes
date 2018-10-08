package com.example.airlines.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Airplane {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @ManyToOne
    @NotNull
    private Airport airport;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    private int fuel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
