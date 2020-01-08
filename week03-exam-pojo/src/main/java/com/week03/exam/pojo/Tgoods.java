package com.week03.exam.pojo;

import java.io.Serializable;

public class Tgoods implements Serializable{

	private int id;
	private String name;
	private String address;
	private int num;
	private String t;
	private String all;
	private String intime;
	private String outtime;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getAll() {
		return all;
	}
	public void setAll(String all) {
		this.all = all;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	@Override
	public String toString() {
		return "Tgoods [id=" + id + ", name=" + name + ", address=" + address + ", num=" + num + ", t=" + t + ", all="
				+ all + ", intime=" + intime + ", outtime=" + outtime + "]";
	}
	
}
