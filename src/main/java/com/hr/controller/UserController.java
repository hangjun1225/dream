package com.hr.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.domain.User;
import com.hr.enums.DbankErrorCode;
import com.hr.service.UserService;
import com.hr.utils.DES3Util;
import com.hr.zException.DbankException;

@Controller()
@RequestMapping("/user")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(ExampleController.class);
	@Autowired
	private JdbcTemplate JdbcTemplate;
	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public String register(User user) {
		// check data
		if (StringUtils.isEmpty(user.getUsername())) {
			throw new DbankException(DbankErrorCode.UC000001);
		}
		// 判断用户名是否被使用
		User queryUser = userService.queryByUsername(user.getUsername());
		if (null != queryUser) {
			throw new DbankException(DbankErrorCode.UC000002);
		}
		// 用户注册
		String password = user.getPassword();
		byte[] encrypt = DES3Util.encrypt(password, "123456781234567812345678");
		try {
			password = new String(encrypt, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		user.setPassword(password);
		user.setUpdateTime(new Date());
		user.setCreateTime(new Date());
		int i = userService.addUser(user);
		if (i == 1) {
			System.out.println("成功");
		}
		return "success";
	}

	@RequestMapping("/login")
	public String login(User user) {
		// check data
		String username = user.getUsername();
		if (StringUtils.isEmpty(username)) {
			throw new DbankException(DbankErrorCode.UC000001);
		}

		String password = user.getPassword();
		byte[] encrypt = DES3Util.encrypt(password, "123456781234567812345678");
		try {
			password = new String(encrypt, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		userService.queryByUsernameAndPassowrd(username, password);

		return "success";
	}

	@RequestMapping("/add")
	public String test1() {
		logger.info("welcome you !");
		return "Hello World!";
	}

}
