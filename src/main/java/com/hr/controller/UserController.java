package com.hr.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hr.domain.User;
import com.hr.dto.Result;
import com.hr.enums.DbankErrorCode;
import com.hr.service.UserService;
import com.hr.utils.DES3Util;

@RestController()
@RequestMapping("/user")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(ExampleController.class);
//	@Autowired
//	private JdbcTemplate JdbcTemplate;
	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public Result register(User user) {
//		// check data
//		if (StringUtils.isEmpty(user.getUsername())) {
//			return new Result<>(DbankErrorCode.UC000001);
//		}
//		// 判断用户名是否被使用
//		User queryUser = userService.queryByUsername(user.getUsername());
//		if (null != queryUser) {
//			return new Result<>(DbankErrorCode.UC000002);
//		}
//		// 用户注册
//		String password = user.getPassword();
//		byte[] encrypt = DES3Util.encrypt(password, "123456781234567812345678");
//		try {
//			password = new String(encrypt, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		user.setPassword(password);
//		user.setUpdateTime(new Date());
//		user.setCreateTime(new Date());
//		int i = userService.addUser(user);
//		if (i != 1) {
//			return new Result<>(DbankErrorCode.UC999999);
//		}
		return new Result<>();
	}

	@RequestMapping("/login")
	public Result login(User user,ModelAndView mv) throws UnsupportedEncodingException {
		// check data
		String username = user.getUsername();
		String password = user.getPassword();
		if (StringUtils.isEmpty(username)) {
			return new Result<>(DbankErrorCode.UC000001); 
		}
		if (StringUtils.isEmpty(password)) {
			return new Result<>(DbankErrorCode.UC000001); 
		}
		//根据用户名和密码查询用户;如果email也不为空,三个条件一起查
		List<User> userList= userService.queryByUsernameAndPassword(user);
		if(null==userList || userList.size()!=1) {
			return new Result<>(DbankErrorCode.UC000002); 
		}
		
//		byte[] encrypt = DES3Util.encrypt(password, "123456781234567812345678");
//		password = new String(encrypt, "UTF-8");
		return new Result<>();
	}

	
	@RequestMapping("/add")
	public String test1() {
		logger.info("welcome you !");
		return "Hello World!";
	}

}
