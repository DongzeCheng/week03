package com.week03.exam.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.week03.exam.pojo.User;
import com.week03.exam.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Reference
	private UserService userService;
	
	@RequestMapping("/register")
	public void register(@RequestBody User user){
		userService.register(user);
	}
}
