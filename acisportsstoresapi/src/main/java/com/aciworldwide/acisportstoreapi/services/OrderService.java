package com.aciworldwide.acisportstoreapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.acisportstoreapi.model.Order;
import com.aciworldwide.acisportstoreapi.model.Product;
import com.aciworldwide.acisportstoreapi.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order saveOrders(Order order)
	{
		return orderRepository.save(order);
	}
	
	
	public List<Order> getOrder()
	{
		return orderRepository.findAll();
	}
}
