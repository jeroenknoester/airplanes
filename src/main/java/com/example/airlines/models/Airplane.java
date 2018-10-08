package com.example.airlines.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @ManyToOne
//    @NotNull
//    private long Airport;

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
