package com.aciworldwide.spring.greeting;

public class NewYearGreeting implements Greeting {

	public NewYearGreeting() {

		System.out.println("NEW YEAR GREETING CREATED");
	}
	@Override
	public void greet() {
		System.out.println("HAPPY NEW YEAR");
	}

	
}
