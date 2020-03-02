package com.aciworldwide.acisportstoreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aciworldwide.acisportstoreapi.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
