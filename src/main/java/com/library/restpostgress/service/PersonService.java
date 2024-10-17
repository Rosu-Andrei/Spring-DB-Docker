package com.library.restpostgress.service;

import com.library.restpostgress.model.Person;
import com.library.restpostgress.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }

    public Person getByCnp(long cnp) {
        return personRepository.findById(cnp).get();
    }

    public void delete(long cnp) {
        personRepository.deleteById(cnp);
    }
}
