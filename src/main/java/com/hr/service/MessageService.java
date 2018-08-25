package com.hr.service;

import java.util.List;

import com.hr.domain.Message;

public interface MessageService {
	
	List<Message> queryAll();
	
	Message queryById(Integer id);
	
	int addMessage(Message message);
	
	int modifyMessage(Message message);
	
	
	
	
	
	
}
