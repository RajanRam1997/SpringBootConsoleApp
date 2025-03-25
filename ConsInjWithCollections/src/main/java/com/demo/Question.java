package com.demo;

public class Question {
	int id;
	String desc; //Question description
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", desc=" + desc + "]";
	}
	
	
}
