package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) 
	{
		
		
		//load the Spring Configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Reterive bean from Spring Container
		
		
		Coach thecoach=context.getBean("myCoach",Coach.class);
		
		Coach thecoach1=context.getBean("myCoach1",Coach.class);
		
		//Call the method
		
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach1.getDailyWorkout());
		
		//close the context
		
		context.close();
		

	}

}
