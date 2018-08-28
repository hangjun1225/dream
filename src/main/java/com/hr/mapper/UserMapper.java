package com.hr.mapper;


import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.User;

@Mapper
public interface UserMapper {

	public User selectById(Integer id);

	public User selectByUsername(String username);

	public int updateUser(User user);
	
	public int insertUser(User user);

	
}
