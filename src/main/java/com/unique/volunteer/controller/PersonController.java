package com.unique.volunteer.controller;

import com.unique.volunteer.bean.Person;
import com.unique.volunteer.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangyongyi on 2020/3/15.
 */
@Controller
public class PersonController {

    @Resource
    PersonService personService;

    @RequestMapping("/getAllPerson")
    @ResponseBody
    public List<Person> getAllPerson(){
        List<Person> personList = personService.getAllPerson();
        return personList;
    }

    @RequestMapping("/addPerson")
    @ResponseBody
    public String addPerson(@RequestBody Person person){
        String result = personService.addPerson(person);
        return result;
    }

    @RequestMapping("/deletePerson")
    @ResponseBody
    public String deletePerson(@RequestBody Person person){
        String result = personService.deletePerson(person);
        return result;
    }

    @RequestMapping("/updatePerson")
    @ResponseBody
    public Person updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }

}
