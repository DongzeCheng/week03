package com.week03.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.week03.exam.pojo.Tgoods;

public interface TgoodsMapper {

	@Select(value="select * from goods")
	List<Tgoods> getList();

	@Select(value="select * from goods where id=#{id}")
	Tgoods back(int id);

	@Update(value="update goods set num=num+#{num} where id=#{id}")
	Tgoods upnum(int id, int num);

}
