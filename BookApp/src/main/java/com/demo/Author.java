package com.demo;

public class Author {
	int authorid;
	String authorname;
	String authoradd;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorid, String authorname, String authoradd) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
		this.authoradd = authoradd;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getAuthoradd() {
		return authoradd;
	}
	public void setAuthoradd(String authoradd) {
		this.authoradd = authoradd;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + ", authoradd=" + authoradd + "]";
	}
	
	
}
