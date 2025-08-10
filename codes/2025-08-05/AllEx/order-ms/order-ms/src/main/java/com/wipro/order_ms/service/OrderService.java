package com.wipro.order_ms.service;

import java.util.List;

import com.wipro.order_ms.entity.Order;

public interface OrderService {
	void save(Order order);
	List<Order> findAll();
}

