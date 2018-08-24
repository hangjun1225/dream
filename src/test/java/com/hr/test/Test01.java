package com.hr.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hr.domain.User;
import com.hr.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {
    @Autowired
    private UserService userService;

    @Test
    public void add() throws Exception {
    	User user=new User();
    	user.setId("1");
    	user.setUsername("2");
        userService.addUser(user);

        //        Assert.assertEquals(new Integer(16), student.getAge());
    }
}
