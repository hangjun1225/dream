package com.hr.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.User;

@Mapper
public interface UserMapper {

	public User selectById(Integer id);

	public int updateUser(User user);
	
	public int insertUser(User user);

	public List<User> selectByUsernameAndPassword(User user);
	
}
