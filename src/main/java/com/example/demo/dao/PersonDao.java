package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person)
    {
        UUID id = UUID.randomUUID();
        return insertPerson(id, new Person(id, "Joy Always"));
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);

}
