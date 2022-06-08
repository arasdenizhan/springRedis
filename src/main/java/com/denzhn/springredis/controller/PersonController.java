package com.denzhn.springredis.controller;

import com.denzhn.springredis.model.Person;
import com.denzhn.springredis.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@RequestMapping("/api/person")
@Api(protocols = "http")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ApiOperation(value = "Person Create Operation")
    public String addPerson(@RequestBody @Valid Person person){
        return personService.addPerson(person);
    }

    @GetMapping
    @ApiOperation(value = "Person Get Operation")
    public Person getPerson(@RequestBody String personId){
        return personService.getPerson(personId);
    }
}
