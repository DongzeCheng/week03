package com.week03.exam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.week03.exam.pojo.Tgoods;
import com.week03.exam.service.TgoodsService;

@RequestMapping("/tgoods")
@RestController
public class TgoodsController {

	@Reference
	private TgoodsService tgoodsService;
	
	@RequestMapping("/getList")
	public List<Tgoods> getList(){
		return tgoodsService.getList();
	}
	
	@RequestMapping("/back")
	public Tgoods back(int id){
		return tgoodsService.back(id);
	}
	
	@RequestMapping("/upnum")
	public Tgoods upnum(int id,int num){
		return tgoodsService.upnum(id,num);
	}
}
