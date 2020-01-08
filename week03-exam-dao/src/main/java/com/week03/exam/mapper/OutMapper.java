package com.week03.exam.mapper;

import org.apache.ibatis.annotations.Insert;

public interface OutMapper {

	@Insert(value="insert into goods value(null,#{outtime},#{outnum})")
	void add(int num1);

}
