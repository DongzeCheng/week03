package com.week03.exam.pojo;

import java.io.Serializable;
import java.sql.Date;

import org.apache.solr.client.solrj.beans.Field;

public class Goods implements Serializable{

	@Field
	private int id;
	@Field("goods_name")
	private String name;
	@Field("goods_price")
	private String price;
	@Field("goods_brand")
	private String brand;
	@Field("goods_shop")
	private String shop;
	@Field("goods_num")
	private int num;
	@Field("goods_uptime")
	private Date uptime;
	@Field("goods_zt")
	private int zt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public int getZt() {
		return zt;
	}
	public void setZt(int zt) {
		this.zt = zt;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", shop=" + shop
				+ ", num=" + num + ", uptime=" + uptime + ", zt=" + zt + "]";
	}
	
}
