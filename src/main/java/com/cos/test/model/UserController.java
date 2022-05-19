package com.cos.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("/")
	public String friends() {
		
		userMapper.findList().forEach(data -> System.out.println(data));
		System.out.println(userMapper.findList());
		return "index";
	}
}
