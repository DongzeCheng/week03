package com.week03.exam.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.week03.exam.pojo.User;

public interface UserMapper {

	@Insert(value="insert into tt_user set name=#{name},pwd=#{pwd}")
	void register(User user);

	@Update(value="update tt_user set pwd=#{pwd}")
	void updatepwd(String pwd);

	@Select(value="select * from tt_user where name=#{name}")
	User findName(String name);

}
