package com.week03.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.week03.exam.pojo.Goods;

public interface GoodsMapper {

	@Select(value="select * from t_goods")
	List<Goods> list();

	@Update(value="update t_goods set zt=1 where id=#{id}")
	void out(int id);

	@Update(value="update t_goods set zt=2 where id=#{id}")
	void back(int id);

	@Select(value="select * from t_goods where zt=1")
	List<Goods> findByZt();

	@Delete(value="delete from t_goods where id=#{id}")
	void delete(int id);

}
