package com.denzhn.springredis.service.impl;

import com.denzhn.springredis.model.Person;
import com.denzhn.springredis.repository.PersonRedisRepository;
import com.denzhn.springredis.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRedisRepository personRedisRepository;

    public PersonServiceImpl(PersonRedisRepository personRedisRepository) {
        this.personRedisRepository = personRedisRepository;
    }

    @Override
    public String addPerson(Person person) {
        return personRedisRepository.save(person).getId();
    }

    @Override
    public Person getPerson(String personId) {
        return personRedisRepository.findById(personId).orElse(new Person());
    }
}
