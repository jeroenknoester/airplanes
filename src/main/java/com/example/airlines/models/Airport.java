package com.example.airlines.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class Airport {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public List<Airplane> getAirplanes() {
//        return airplanes;
//    }

//    public void setAirplanes(List<Airplane> airplanes) {
//        this.airplanes = airplanes;
//    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @OneToMany
//    List<Airplane> airplanes;

    private String City;
    private int capacity;
}
