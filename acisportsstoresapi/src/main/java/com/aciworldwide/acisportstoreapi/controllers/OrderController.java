package com.aciworldwide.acisportstoreapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.acisportstoreapi.model.Order;
import com.aciworldwide.acisportstoreapi.services.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/get")
	public List<Order> getOrder()
	{
		return orderService.getOrder();
	}
	
	@PostMapping("/order")
	public Order saveOrders(@RequestBody Order order)
	{
		return orderService.saveOrders(order);
	}
}
