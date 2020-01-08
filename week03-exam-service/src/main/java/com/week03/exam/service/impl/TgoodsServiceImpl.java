package com.week03.exam.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.week03.exam.mapper.InMapper;
import com.week03.exam.mapper.OutMapper;
import com.week03.exam.mapper.TgoodsMapper;
import com.week03.exam.pojo.In;
import com.week03.exam.pojo.Out;
import com.week03.exam.pojo.Tgoods;
import com.week03.exam.service.TgoodsService;

@Service
public class TgoodsServiceImpl implements TgoodsService{

	@Autowired
	private TgoodsMapper tgoodsMapper;
	
	@Autowired
	private InMapper inMapper;
	
	@Autowired
	private OutMapper outMapper;
	
	@Override
	public List<Tgoods> getList() {
		// TODO Auto-generated method stub
		return tgoodsMapper.getList();
	}

	@Override
	public Tgoods back(int id) {
		// TODO Auto-generated method stub
		return tgoodsMapper.back(id);
	}

	@Override
	public Tgoods upnum(int id, int num) {
		// TODO Auto-generated method stub
		if (num>0) {
			In in = new In();
			in.setInnum(num);
			in.setIntime(new Date());
			inMapper.add(in);
		}else{
			Out out = new Out();
			int num1 = (num*-1);
			out.setOutnum(num);
			out.setOuttime(new Date());
			outMapper.add(num1);
		}
		return tgoodsMapper.upnum(id,num);
	}

}
