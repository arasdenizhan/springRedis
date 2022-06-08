package com.denzhn.springredis.service;

import com.denzhn.springredis.model.Person;

public interface PersonService {
    String addPerson(Person person);
    Person getPerson(String personId);
}
