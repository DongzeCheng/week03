package com.week03.exam.pojo;

import java.io.Serializable;
import java.util.Date;

public class Out implements Serializable{

	private int id;
	private Date outtime;
	private int outnum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	public int getOutnum() {
		return outnum;
	}
	public void setOutnum(int outnum) {
		this.outnum = outnum;
	}
	
}
