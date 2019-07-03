package cn.bolinjiaoyu.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bolinjiaoyu.manage.test.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping("/date")
	@ResponseBody
	public String queryCurrentDate(){
		return testService.queryCurrentDate();
	}

	
}
