package com.aciworldwide.repositories;

import java.util.List;

import com.aciworldwide.entities.Product;
/*
 * 
 * 
 * PERSISTENCE LAYER INTERFACE
 * 
 * 
 */
public interface ProductRepositories {

	Product getById(long id);
	List<Product> getAll();
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	List<Product> getByBrand(String brand);
	Long count();
	
}
