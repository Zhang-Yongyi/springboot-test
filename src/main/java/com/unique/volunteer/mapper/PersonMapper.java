package com.unique.volunteer.mapper;

import com.unique.volunteer.bean.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhangyongyi on 2020/3/15.
 */
public interface PersonMapper {

    List<Person> selectAllPerson();

    void insertPerson(@Param("person")Person person);

    void deletePerson(@Param("person")Person person);

    void updatePerson(@Param("person")Person person);

    Person selectPersonById(@Param("person")Person person);


}
