package com.week03.exam.service;

import java.util.List;

import com.week03.exam.pojo.Goods;

public interface GoodsService {

	List<Goods> list();

	void out(int id);

	void back(int id);

	List<Goods> findByZt();

	void tegezer();

	List<Goods> getSolrList();

	void delete(int id);

	/*void cx(String name);*/

}
