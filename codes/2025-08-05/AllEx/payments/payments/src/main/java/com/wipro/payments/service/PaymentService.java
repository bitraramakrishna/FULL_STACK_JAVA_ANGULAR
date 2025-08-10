package com.wipro.payments.service;

import java.util.List;

import com.wipro.payments.entity.Payment;

public interface PaymentService {
	void save(Payment order);
	List<Payment> findAll();
}
