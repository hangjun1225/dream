package com.hr.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.Message;

@Mapper
public interface MessageMapper {

	public Message selectById(Integer id);

	public int updateMessage(Message message);
	
	public int insertMessage(Message message);
	
	public List<Message> selectAll();
	
}
