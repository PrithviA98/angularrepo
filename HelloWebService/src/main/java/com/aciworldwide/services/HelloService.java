package com.aciworldwide.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTfulweb service
@RestController
public class HelloService {

	@GetMapping("/greet/hello")//resource uri
	public String greet()
	{
		return"WELCOME TO RESTful Web Service";
	}
	
	@GetMapping("/greet/hello/html")//resource uri
	public String greetInHtml()
	{
		return"<h1>WELCOME TO RESTful Web Service<h1>";
	}
	
	@GetMapping("/greet/hello/xml")//resource uri
	public String greetInXml()
	{
		return"<?xml version='1.0?'>WELCOME TO RESTful Web Service<message>";
	}
	
	
	@RequestMapping("/login")
	public String login()
	{
		return"login";
	}
	
	@RequestMapping("/logout-success")
	public String logout()
	{
		return"logout";
	}
	
}
