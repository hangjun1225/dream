package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.domain.Person;
import com.hr.mapper.PersonMapper;
import com.hr.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public Person queryById(Integer id) {
		return personMapper.selectById(id);
	}

	@Override
	public int addPerson(Person person) {
		return personMapper.insertPerson(person);
	}

	@Override
	public int modifyPerson(Person person) {
		return personMapper.updatePerson(person);
	}

	
}
