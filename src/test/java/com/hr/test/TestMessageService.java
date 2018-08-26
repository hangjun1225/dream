package com.hr.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hr.domain.Message;
import com.hr.service.MessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMessageService {
    @Autowired
    private MessageService messageService;
    @Test
    public void queryAll() throws Exception {
        List<Message> list = messageService.queryAll();
        System.out.println(list);
    }
    @Test
    public void add() throws Exception {
    	Message message=new Message();
    	message.setId(1);
    	message.setAddress("1111");
        messageService.addMessage(message);

    }
    
    @Test
    public void queryById() throws Exception {
    	Integer id =1;
        Message message = messageService.queryById(id);
        System.out.println(message);
    }
    
    
    @Test
    public void updateMessage() throws Exception {
    	Message message=new Message();
    	message.setId(1);
    	message.setHouseDecoration("精装修");
        messageService.modifyMessage(message);

    }
}
