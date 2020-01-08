package com.week03.exam.pojo;

import java.io.Serializable;
import java.util.Date;

public class In implements Serializable{

	private int id;
	private Date intime;
	private int innum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public int getInnum() {
		return innum;
	}
	public void setInnum(int innum) {
		this.innum = innum;
	}
	
}
