package com.aciworldwide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aciworldwide.idol.performers.Performer;

@SpringBootApplication
public class DiSpringBootApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(DiSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Performer p=ctx.getBean("Rahul K",Performer.class);
		p.perform();
	}

}
