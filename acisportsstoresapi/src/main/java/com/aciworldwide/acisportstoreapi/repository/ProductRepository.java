package com.aciworldwide.acisportstoreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aciworldwide.acisportstoreapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
