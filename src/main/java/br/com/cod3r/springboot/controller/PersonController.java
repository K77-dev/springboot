package br.com.cod3r.springboot.controller;

import br.com.cod3r.springboot.model.entity.Person;
import br.com.cod3r.springboot.model.service.IPersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private IPersonService service;

    @PostMapping
    public Person add(@Valid Person person) {
        return service.save(person);
    }

    @GetMapping
    public Iterable<Person> getAll() {
        return (Iterable<Person>) service.getAll();
    }

}

