package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.domain.Message;
import com.hr.mapper.MessageMapper;
import com.hr.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageMapper messageMapper;
	
	@Override
	public List<Message> queryAll() {
		return messageMapper.selectAll();
	}
	
	@Override
	public Message queryById(Integer id) {
		return messageMapper.selectById(id);
	}

	@Override
	public int addMessage(Message message) {
		return messageMapper.insertMessage(message);
	}

	@Override
	public int modifyMessage(Message message) {
		return messageMapper.updateMessage(message);
	}




	
}
