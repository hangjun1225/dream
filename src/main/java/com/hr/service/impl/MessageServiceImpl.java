package com.hr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public int count() {
		return messageMapper.count();
	}

	@Override
	public List<Message> queryMessagesByPage(int currentRow, int pageSize) {
		Map map=new HashMap<>();
		map.put("currentRow", currentRow);
		map.put("pageSize", pageSize);
		return messageMapper.selectMessageByPage(map);
	}





	
}
