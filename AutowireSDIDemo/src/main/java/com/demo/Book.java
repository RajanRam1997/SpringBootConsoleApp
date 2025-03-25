package com.demo;

public class Book {
	int bid;
	String btitle;
	Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String btitle, Author author) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", btitle=" + btitle + ", author=" + author + "]";
	}
	
	
}
