package com.aciwebapp.aciwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String viewHomePage()
	{
		return "home.jsp";
	}
}
