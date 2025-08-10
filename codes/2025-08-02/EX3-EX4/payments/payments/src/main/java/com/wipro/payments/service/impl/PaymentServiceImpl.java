package com.wipro.payments.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.payments.entity.Payment;
import com.wipro.payments.repo.PaymentRepo;
import com.wipro.payments.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	PaymentRepo paymentRepo;
	
	@Override
	public void save(Payment payment) {
		 
		paymentRepo.save(payment);
	}

	@Override
	public List<Payment> findAll() {
		 
		return paymentRepo.findAll();
	}
}
