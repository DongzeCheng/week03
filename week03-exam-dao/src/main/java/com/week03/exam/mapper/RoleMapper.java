package com.week03.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.week03.exam.pojo.Auth;
import com.week03.exam.pojo.Role;

public interface RoleMapper {

	@Select(value="select * from t_role")
	List<Role> rolelist();

	@Select(value="select * from t_auth")
	List<Auth> authlist();

}
