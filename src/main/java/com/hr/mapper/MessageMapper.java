package com.hr.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.hr.domain.Message;

@Mapper
public interface MessageMapper {

	public Message selectById(Integer id);

	public int updateMessage(Message message);
	
	public int insertMessage(Message message);
	
	public List<Message> selectAll();

	/**
	 * 查询总数
	 * @return
	 */
	public int count();
	/**
	 * 查询当前页的记录
	 * @param currentRow
	 * @param pageSize
	 * @return
	 */
	public List<Message> selectMessageByPage(Map map);
	
}
