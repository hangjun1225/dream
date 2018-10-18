package com.hr.service;

import java.util.List;

import com.hr.domain.User;

public interface UserService {
	
	User queryById(Integer id);
	
	int addUser(User user);
	
	int modifyUser(User user);

	List<User> queryByUsernameAndPassword(User user);
	

	
	
	
	
	
}
