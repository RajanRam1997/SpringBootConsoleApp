package com.demo;

public class Country {
	int cid;
	String cname;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
