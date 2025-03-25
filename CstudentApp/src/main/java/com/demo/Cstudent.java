package com.demo;

//Spring Example Using Annotation 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cstudent {
	int roll;
	String name;
	String Stream;
	float marks;
	public Cstudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Cstudent(@Value("101") int roll,@Value("Rajan Ram") String name,@Value("Science")String stream,@Value("66")float marks) {
		super();
		this.roll = roll;
		this.name = name;
		Stream = stream;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Cstudent [roll=" + roll + ", name=" + name + ", Stream=" + Stream + ", marks=" + marks + "]";
	}
}
