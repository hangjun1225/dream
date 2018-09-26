package com.hr.service;

import java.util.List;

import com.hr.domain.Message;

public interface MessageService {
	
	List<Message> queryAll();
	
	Message queryById(Integer id);
	
	int addMessage(Message message);
	
	int modifyMessage(Message message);

	/**
	 * 查询总数
	 * @return
	 */
	int count();
	/**
	 * 分页查询
	 * @param currentRow
	 * @param pageSize
	 * @return
	 */
	List<Message> queryMessagesByPage(int currentRow, int pageSize);
	
	
	
	
	
	
}
