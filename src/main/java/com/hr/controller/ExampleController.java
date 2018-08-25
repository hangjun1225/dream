package com.hr.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.domain.User;
import com.hr.enums.DbankErrorCode;
import com.hr.service.UserService;
import com.hr.zException.DbankException;

@RestController
public class ExampleController {
	private Logger logger =LoggerFactory.getLogger(ExampleController.class);
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/test1")
    public String test1() {
		logger.info("welcome you !");
        return "Hello World!";
    }
	
	@RequestMapping("/success")
    public String test2(Map<String,Object> map) {
		map.put("hello", "你好");
			
		return "success";
    }
	
	
	
	@RequestMapping("/err")
    public String test3() {
		System.out.println("处理异常信息");
		String msg=null;
		try {
			String string = msg.toString();
		} catch (Exception e) {
			throw new DbankException(DbankErrorCode.UC000002);
		}
		return "aaa";
    }
	
	
	
	@RequestMapping("/testJdbc")
	public Map<String,Object> test4() {
		List<Map<String, Object>> list = JdbcTemplate.queryForList("select * from department");
		return list.get(0);
	}


	@RequestMapping("/test5")
	public String test5() {
		User user=new User();
		user.setId(1);
		user.setUsername("2");
		userService.addUser(user);
		
		return "success" ;
	}

	
}
