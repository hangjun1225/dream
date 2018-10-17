package com.hr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.domain.Message;
import com.hr.dto.Result;
import com.hr.enums.DbankErrorCode;
import com.hr.service.MessageService;

/**
 * 主页展示的controller
 * @author hangjun
 *
 */
@Controller()
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/toHome")
	public String toHome() {
		
		return "/home/home";
	}
	
	
	@RequestMapping("/getAllMessages")
	public Result getMessagesByPage(int pageNo,int pageSize) {//page:pageNo,rows:pageSize
		//查询当前页的记录数
		List<Message> dataList = messageService.queryMessagesByPage((pageNo-1)*pageSize,pageSize);
		//查询记录总数
		int count = messageService.count();
		//rows代表easyUi接受的数据,total总共的数据
		//{total:xx,rows:[{xx},{}]}
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("rows", dataList);
		params.put("total", count);
		//最终格式{"retCode":"","retMessage":"","":{}}
		return new Result(DbankErrorCode.UC000000,params);
	}
	
}
