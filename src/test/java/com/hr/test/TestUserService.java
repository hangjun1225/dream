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
public class TestUserService {
    @Autowired
    private UserService userService;

    
    
    @Test
    public void add() throws Exception {
    	User user=new User();
    	user.setId(1);
    	user.setUsername("2");
        userService.addUser(user);

        //        Assert.assertEquals(new Integer(16), student.getAge());
    }
    
    @Test
    public void queryById() throws Exception {
    	Integer id =1;
        User user = userService.queryById(id);
        System.out.println(user);

        //        Assert.assertEquals(new Integer(16), student.getAge());
    }
    
    @Test
    public void selectByUsername() throws Exception {
    	String username="2";
        User user = userService.queryByUsername(username);
        System.out.println(user);

        //        Assert.assertEquals(new Integer(16), student.getAge());
    }
    
    
    @Test
    public void updateUser() throws Exception {
    	User user=new User();
    	user.setId(1);
    	user.setUsername("2");
    	user.setEmail("2292491241@qq.com");
        userService.modifyUser(user);

        //        Assert.assertEquals(new Integer(16), student.getAge());
    }
}
