package com.hr.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.BlackList;

@Mapper
public interface BlackListMapper {

	public BlackList selectByPersonId(Integer personId);

	
}
