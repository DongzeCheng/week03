package com.week03.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.week03.exam.mapper.RoleMapper;
import com.week03.exam.pojo.Auth;
import com.week03.exam.pojo.Role;
import com.week03.exam.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> rolelist() {
		// TODO Auto-generated method stub
		return roleMapper.rolelist();
	}

	@Override
	public List<Auth> authlist() {
		// TODO Auto-generated method stub
		return roleMapper.authlist();
	}

}
