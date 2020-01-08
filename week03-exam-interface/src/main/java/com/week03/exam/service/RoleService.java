package com.week03.exam.service;

import java.util.List;

import com.week03.exam.pojo.Auth;
import com.week03.exam.pojo.Role;

public interface RoleService {

	List<Role> rolelist();

	List<Auth> authlist();

	
}
