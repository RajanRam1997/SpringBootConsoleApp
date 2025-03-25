package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Student student=(Student)context.getBean("student");
    	//when we print object,its toString() method gets called automatically
    	System.out.println(student);
    }
}
