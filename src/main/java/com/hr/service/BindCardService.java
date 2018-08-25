package com.hr.service;

import com.hr.domain.BindCard;

public interface BindCardService {
	
	BindCard queryById(Integer id);
	
	int addBindCard(BindCard person);
	
	int modifyBindCard(BindCard person);
	
	
	
	
	
	
}
