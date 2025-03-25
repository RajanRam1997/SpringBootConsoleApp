package com.demo;

public class Answer {
	int id;
	String desc;// Answer Description
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", desc=" + desc + "]";
	}
	
	
	
}
