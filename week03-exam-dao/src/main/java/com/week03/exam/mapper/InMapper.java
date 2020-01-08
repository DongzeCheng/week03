package com.week03.exam.mapper;

import org.apache.ibatis.annotations.Insert;

import com.week03.exam.pojo.In;

public interface InMapper {

	@Insert(value="insert into goods value(null,#{intime},#{innum})")
	void add(In in);

}
