package com.example.airlines.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @NotNull
//    private List<Writer> writers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public List<Writer> getWriters() {
//        return writers;
//    }
//
//    public void setWriters(List<Writer> writers) {
//        this.writers = writers;
//    }
}
