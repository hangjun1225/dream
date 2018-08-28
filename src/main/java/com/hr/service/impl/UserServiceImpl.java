package com.hr.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.domain.User;
import com.hr.mapper.UserMapper;
import com.hr.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		int i= userMapper.insertUser(user);
		return i;
	}

	@Override
	public User queryById(Integer id) {
		return userMapper.selectById(id);
	}

	@Override
	public User queryByUsername(String username) {
		return userMapper.selectByUsername(username);
	}

	@Override
	public int modifyUser(User user) {
		return userMapper.updateUser(user);
	}

	
}
