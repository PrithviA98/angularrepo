package com.aciworldwide.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.entities.ExchangeValue;
import com.aciworldwide.repositories.ExchangeValueRepository;

@RestController
public class ForexServices {

	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository repository;
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{
		ExchangeValue exchangeValue=repository.findByFromAndTo(from, to);
		
		System.out.println(exchangeValue);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		
		return exchangeValue;
		
	}
	
	
}
