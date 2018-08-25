package com.hr.service;

import com.hr.domain.Person;

public interface PersonService {
	
	Person queryById(Integer id);
	
	int addPerson(Person person);
	
	int modifyPerson(Person person);
	
	
	
	
	
	
}
