package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {
	int aid;
	String aname;
	String amno;
	
	@Autowired
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int aid, String aname, String amno) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.amno = amno;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAmno() {
		return amno;
	}
	public void setAmno(String amno) {
		this.amno = amno;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", amno=" + amno + "]";
	}
	
	
}
