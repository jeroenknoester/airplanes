package com.example.airlines.controllers;

import com.example.airlines.models.Writer;
import com.example.airlines.repositories.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/writer/")
public class WriterController {

    @Autowired
    private WriterRepository writerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Writer> getAll(){
        return writerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Writer create(@RequestBody Writer writer)
    {
        return writerRepository.save(writer);
    }
}
