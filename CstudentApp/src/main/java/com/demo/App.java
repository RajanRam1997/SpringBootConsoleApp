package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new AnnotationConfigApplicationContext(Cstudent.class);
    	Cstudent c1=(Cstudent)context.getBean(Cstudent.class);
    	System.out.println( c1 );
    }
}
