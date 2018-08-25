package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.domain.BindCard;
import com.hr.domain.Person;
import com.hr.mapper.BindCardMapper;
import com.hr.service.BindCardService;

@Service
public class BindCardServiceImpl implements BindCardService {
	
	@Autowired
	private BindCardMapper bindCardMapper;

	@Override
	public BindCard queryById(Integer id) {
		return bindCardMapper.selectById(id);
	}

	@Override
	public int addBindCard(BindCard bindCard) {
		return bindCardMapper.insertBindCard(bindCard);
	}

	@Override
	public int modifyBindCard(BindCard bindCard) {
		return bindCardMapper.updateBindCard(bindCard);
	}
	

	
}
