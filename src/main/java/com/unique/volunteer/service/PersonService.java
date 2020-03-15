package com.unique.volunteer.service;

import com.unique.volunteer.bean.Person;

import java.util.List;

/**
 * Created by zhangyongyi on 2020/3/15.
 */
public interface PersonService {

    List<Person> getAllPerson();
    String addPerson(Person person);
    String deletePerson(Person person);
    Person updatePerson(Person person);

}
