package com.example.airlines.repositories;

import com.example.airlines.models.Writer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends CrudRepository<Writer, Long> {
    Writer findOneByName(String name);
}
