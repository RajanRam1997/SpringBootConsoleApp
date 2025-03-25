package com.demo;

public class Book {
	int bookid;
	String bookname;
	
	//containment or has a kind if relation
	Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String bookname, Author author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + "]";
	}
	
}
