package com.week03.exam.service;

import java.util.List;

import com.week03.exam.pojo.Tgoods;

public interface TgoodsService {

	public List<Tgoods> getList();

	public Tgoods back(int id);

	public Tgoods upnum(int id, int num);
}
