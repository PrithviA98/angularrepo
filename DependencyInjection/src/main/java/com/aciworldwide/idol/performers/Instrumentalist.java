package com.aciworldwide.idol.performers;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.aciworldwide.idol.instruments.Instrument;


//dependent
@Component("Rahul K")
public class Instrumentalist implements Performer,BeanNameAware{

	
	String name;
	
	@Value("ek do theen...")//value is used to only simple dependency property//To inject
	private String song;//dependency property(simple)
	
	@Autowired//
	@Qualifier("guitar")
	//value is used to only simple dependency property
	//Object of Instrument is created 
	private Instrument instrument;//Loose coupling...dependency object(complex)
	
	
	//Business logic method
	@Override
	public void perform() {
	
		System.out.println("Instrumentalist"+name+" is paining the song..."+song);
		instrument.play();

	}


	@Override
	public void setBeanName(String name) {
		this.name=name;
		
	}

}
