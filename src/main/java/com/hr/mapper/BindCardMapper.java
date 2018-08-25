package com.hr.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.BindCard;

@Mapper
public interface BindCardMapper {

	public BindCard selectById(Integer id);

	public int updateBindCard(BindCard bindCard);
	
	public int insertBindCard(BindCard bindCard);
	
}
