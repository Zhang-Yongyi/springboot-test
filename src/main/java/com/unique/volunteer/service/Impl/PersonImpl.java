package com.unique.volunteer.service.Impl;

import com.unique.volunteer.bean.Person;
import com.unique.volunteer.mapper.PersonMapper;
import com.unique.volunteer.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangyongyi on 2020/3/15.
 */
@Service
public class PersonImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> getAllPerson() {
        return personMapper.selectAllPerson();
    }

    @Override
    public String addPerson(Person person) {
        try{
            personMapper.insertPerson(person);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }

    @Override
    public String deletePerson(Person person) {
        try{
            personMapper.deletePerson(person);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }

    @Override
    public Person updatePerson(Person person) {
        personMapper.updatePerson(person);
        return personMapper.selectPersonById(person);
    }

}
