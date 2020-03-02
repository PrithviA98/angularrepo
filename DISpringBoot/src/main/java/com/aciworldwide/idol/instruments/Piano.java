package com.aciworldwide.idol.instruments;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
System.out.println("Ping..Ping..");
	}

}
