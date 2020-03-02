package com.aciworldwide.acisportstoreapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aciworldwide.acisportstoreapi.model.Product;
import com.aciworldwide.acisportstoreapi.repository.ProductRepository;


@Service
public class ProductService 
{
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getProducts()
	{
		return repository.findAll();
	}
	
	public Product getProduct(long id)
	{
		return repository.getOne(id);
	}
	
	public Product insert(Product product)
	{
		return repository.saveAndFlush(product);
	}
	
	public void delete(Long id)
	{
		repository.deleteById(id);
	}
	
	public void update(Product product)
	{
		repository.saveAndFlush(product);
	}
	
}
