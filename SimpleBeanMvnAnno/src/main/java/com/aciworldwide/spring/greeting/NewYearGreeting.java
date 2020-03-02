package com.aciworldwide.spring.greeting;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("happy")
@Scope("singleton")
public class NewYearGreeting implements Greeting {


	public NewYearGreeting() {

		System.out.println("NEW YEAR GREETING CREATED");
	}
	@Override
	public void greet() {
		System.out.println("HAPPY NEW YEAR");
	}

	
}
