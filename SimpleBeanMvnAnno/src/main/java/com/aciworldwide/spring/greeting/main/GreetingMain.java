package com.aciworldwide.spring.greeting.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aciworldwide.spring.greeting.Greeting;

//HOW SPRING CREATES OBJECT

/*
 * Configuration is done using xml 
 * xml <bean> tag is used using id and class which has to be a concrete class
 */
@Configuration
@ComponentScan (basePackages= {"com.aciworldwide"})

public class GreetingMain {

	public static void main(String[] args) 
	{
		//Creating spring IOC object
		ApplicationContext ctx=new AnnotationConfigApplicationContext(GreetingMain.class);
		
		Greeting g=ctx.getBean("happy", Greeting.class);	//Can directly mention the interface class ...no need of type casting like in previous version
		g.greet();
		
		Greeting g1=ctx.getBean("happy", Greeting.class);	//Can directly mention the interface class ...no need of type casting like in previous version
		g1.greet();// Accepts bean id from user ...no changes to the code  
	//For any change we just need to give bean id's hence no changes at all ...and code is not exposed to client 
		
		if(g==g1)
		{
			System.out.println("Single object..");
		}
		else
		{
			System.out.println("Different object..");
		}
	}

}
