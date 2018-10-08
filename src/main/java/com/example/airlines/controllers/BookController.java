package com.example.airlines.controllers;

import com.example.airlines.models.Book;
import com.example.airlines.models.Writer;
import com.example.airlines.repositories.BookRepository;
import com.example.airlines.repositories.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/book/")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private WriterRepository writerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> getAll(){
        return bookRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book create(@RequestBody Book book)
    {
        // check if book has a writer and if it exists -- eigenlijk services
        for (Writer writer: book.getWriters()){
            Optional<Writer> newWriter = writerRepository.findById(writer.getId());

            if(!newWriter.isPresent()){
                throw new RuntimeException();
            }
        }
        return bookRepository.save(book);
    }
}