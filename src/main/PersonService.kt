package com.example.h2ormhybernate;

import com.example.h2ormhybernate.com.example.h2ormhybernate.Person
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
class PersonService(private val personRepository: PersonRepository) {
    fun savePerson(person: Person): Person {
        return personRepository.save(person);
    }

    fun getPersonById(id: Long): Person {
        return personRepository.findById(id).orElseThrow{
            NoSuchElementException("Person not found")
        };
    }
}
