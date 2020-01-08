package com.week03.exam.controller;

import java.util.List;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.week03.exam.pojo.Goods;
import com.week03.exam.service.GoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Reference
	private GoodsService goodsService;
	
	@Autowired
	private Destination updateSolrDestination;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	//获取商品列表页面
	@RequestMapping("/list")
	public List<Goods> list(){
		return goodsService.list();
	}
	
	//商品通过审核
	@RequestMapping("/out")
	public void out(final int id){
		jmsTemplate.send(updateSolrDestination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				String id1=id+"";
				return session.createTextMessage(id1);
			}
		});
	}
	
	//商品驳回
	@RequestMapping("/back")
	public void back(int id){
		goodsService.back(id);
	}
	
	//商品同步
	@RequestMapping("/tegezer")
	public void back(){
		goodsService.tegezer();
	}
	
	//获取solr数据库
	@RequestMapping("/getSolrList")
	public List<Goods> getSolrList(){
		List<Goods> list = goodsService.getSolrList();
		return list;
	}
	
	//删除
	@RequestMapping("/delete")
	public void delete(int id){
		goodsService.delete(id);
	}
	
	/*//查询
		@RequestMapping("/cx")
		public void cx(String name){
			goodsService.cx(name);
		}*/
}
