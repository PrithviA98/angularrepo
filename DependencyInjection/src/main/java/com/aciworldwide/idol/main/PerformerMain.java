package com.aciworldwide.idol.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aciworldwide.idol.performers.Performer;

@Configuration
@ComponentScan(basePackages="com.aciworldwide")
public class PerformerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new AnnotationConfigApplicationContext(PerformerMain.class);
		Performer p=ctx.getBean("Rahul K",Performer.class);
		p.perform();
		
	}

}
