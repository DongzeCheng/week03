package com.week03.exam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.week03.exam.pojo.Auth;
import com.week03.exam.pojo.Role;
import com.week03.exam.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Reference
	private RoleService roleService;
	
	@RequestMapping("/rolelist")
	public List<Role> rolelist(){
		return roleService.rolelist();
	}
	
	@RequestMapping("/authlist")
	public List<Auth> authlist(){
		return roleService.authlist();
	}
}
