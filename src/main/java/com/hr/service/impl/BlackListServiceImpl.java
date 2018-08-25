package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.domain.BlackList;
import com.hr.mapper.BlackListMapper;
import com.hr.service.BlackListService;

@Service
public class BlackListServiceImpl implements BlackListService {
	
	@Autowired
	private BlackListMapper blackListMapper;

	@Override
	public BlackList queryByPersonId(Integer personId) {
		return blackListMapper.selectByPersonId(personId);
	}


	
}
