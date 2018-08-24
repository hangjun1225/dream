package com.hr.service;

import com.hr.domain.User;

public interface UserService {
	
	User queryById(Integer id);
	
	User queryByUsername(String username);
	
	int addUser(User user);
	
	int modifyUser(User user);
	
	
	
	
	
	
}
