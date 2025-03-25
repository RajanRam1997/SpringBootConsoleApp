package com.demo;

public class Address {
	int houseno;
	String streetname;
	String city;
	int zipcode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseno, String streetname, String city, int zipcode) {
		super();
		this.houseno = houseno;
		this.streetname = streetname;
		this.city = city;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", streetname=" + streetname + ", city=" + city + ", zipcode=" + zipcode
				+ "]";
	}
	
}
