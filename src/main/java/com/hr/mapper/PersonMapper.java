package com.hr.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.Person;

@Mapper
public interface PersonMapper {

	public Person selectById(Integer id);

	public int updatePerson(Person person);
	
	public int insertPerson(Person person);
	
}
