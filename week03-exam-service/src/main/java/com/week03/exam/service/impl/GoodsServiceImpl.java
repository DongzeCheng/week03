package com.week03.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.SimpleQuery;

import com.alibaba.dubbo.config.annotation.Service;
import com.week03.exam.mapper.GoodsMapper;
import com.week03.exam.pojo.Goods;
import com.week03.exam.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Autowired
	private SolrTemplate solrTemplate;

	@Override
	public List<Goods> list() {
		// TODO Auto-generated method stub
		List<Goods> list = goodsMapper.list();
		for (Goods goods : list) {
			if (goods.getZt()==1) {
				solrTemplate.saveBean(goods);
				solrTemplate.commit();
			}
		}
		return list;
	}

	@Override
	public void out(int id) {
		// TODO Auto-generated method stub
		goodsMapper.out(id);
	}

	@Override
	public void back(int id) {
		// TODO Auto-generated method stub
		goodsMapper.back(id);
	}

	@Override
	public List<Goods> findByZt() {
		// TODO Auto-generated method stub
		return goodsMapper.findByZt();
	}

	@Override
	public void tegezer() {
		// TODO Auto-generated method stub
		List<Goods> list = goodsMapper.list();
		for (Goods goods : list) {
			if (goods.getZt()==0) {
				solrTemplate.saveBean(goods);
				solrTemplate.commit();
			}
		}
	}

	@Override
	public List<Goods> getSolrList() {
		// TODO Auto-generated method stub
		//solrTemplate.getClass();
         return goodsMapper.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String id1=id+"";
		solrTemplate.deleteById(id1);
		goodsMapper.delete(id);
	}

	/*@Override
	public void cx(String name) {
		// TODO Auto-generated method stub
		goodsMapper.cx(name)
	}*/
	
	
}
