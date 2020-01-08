package com.week03.exam.service.impl;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.alibaba.dubbo.config.annotation.Service;
import com.week03.exam.mapper.UserMapper;
import com.week03.exam.pojo.User;
import com.week03.exam.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private Destination registerSolrDestination;
	
	@Override
	public void register(final User user) {
		// TODO Auto-generated method stub
		jmsTemplate.send(registerSolrDestination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				String tel = user.getTel();
				return session.createTextMessage(tel);
			}
		});
	}

}
