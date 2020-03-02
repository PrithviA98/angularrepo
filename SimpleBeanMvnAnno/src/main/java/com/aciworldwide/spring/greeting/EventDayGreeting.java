package com.aciworldwide.spring.greeting;

import org.springframework.stereotype.Component;

@Component("event")
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
