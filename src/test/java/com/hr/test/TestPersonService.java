package com.hr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hr.domain.Person;
import com.hr.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPersonService {
    @Autowired
    private PersonService PersonService;

    @Test
    public void add() throws Exception {
    	Person person=new Person();
    	person.setIdNumber("123123");
        PersonService.addPerson(person);
    }
    @Test
    public void queryById() throws Exception {
    	Integer id =1;
        Person person = PersonService.queryById(id);
        System.out.println(person);

    }
    
    @Test
    public void updatePerson() throws Exception {
    	Person person=new Person();
    	person.setId(1);
    	person.setMobile("13581718290");
        PersonService.modifyPerson(person);

    }
}
