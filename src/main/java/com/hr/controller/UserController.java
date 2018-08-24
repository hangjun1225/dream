package com.hr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.service.UserService;

@Controller("user")
public class UserController {
	private Logger logger =LoggerFactory.getLogger(ExampleController.class);
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/add")
    public String test1() {
		logger.info("welcome you !");
        return "Hello World!";
    }
}
