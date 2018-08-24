package com.hr.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.User;

@Mapper
public interface UserMapper {

    public int insertUser(User user);
}
