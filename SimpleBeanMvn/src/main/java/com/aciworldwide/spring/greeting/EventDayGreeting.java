package com.aciworldwide.spring.greeting;

public class EventDayGreeting implements Greeting {

	public EventDayGreeting() 
	{
		System.out.println("EventDayGreeting created");
	}
	@Override
	public void greet() {
		System.out.println("HAPPY Women's day");
	}

}
