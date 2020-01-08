package com.week03.exam.service.impl;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import com.week03.exam.pojo.Goods;
import com.week03.exam.service.GoodsService;

@Component
public class updateListener implements MessageListener{

	@Autowired
	private SolrTemplate solrTemplate;
	
	@Autowired
	private GoodsService goodsService;
	
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		TextMessage textMessage = (TextMessage) message;
		try {
			String id = textMessage.getText();
			int i = Integer.parseInt(id);
			goodsService.out(i);
			List<Goods> list = goodsService.findByZt();
			solrTemplate.saveBeans(list);
			solrTemplate.commit();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
