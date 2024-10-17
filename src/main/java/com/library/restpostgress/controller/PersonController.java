package com.library.restpostgress.controller;

import com.library.restpostgress.model.Person;
import com.library.restpostgress.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping()
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping("/{cnp}")
    public Person getById(@PathVariable(name = "cnp") long cnp) {
        return personService.getByCnp(cnp);
    }

    @PostMapping()
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @DeleteMapping("/{cnp}")
    public void delete(@PathVariable(name = "cnp") long cnp) {
        personService.delete(cnp);
    }
}
