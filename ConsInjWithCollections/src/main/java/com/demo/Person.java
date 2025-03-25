package com.demo;

import java.util.List;
import java.util.Map;

public class Person {
	int id;
	String name;
	Country country;
	List <String> languages;
	List <Address> addresses;
	Map<String,String> phones;
	Map<Question,Answer> answersheet;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Country country, List<String> languages, List<Address> addresses,
			Map<String, String> phones, Map<Question, Answer> answersheet) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.languages = languages;
		this.addresses = addresses;
		this.phones = phones;
		this.answersheet = answersheet;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", country=" + country + ", languages=" + languages
				+ ", addresses=" + addresses + ", phones=" + phones + ", answersheet=" + answersheet + "]";
	}
	
	
}
