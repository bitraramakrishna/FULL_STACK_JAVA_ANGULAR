package com.wipro.paymentms.service;

import com.wipro.paymentms.dto.PaymentMessage;

public interface PaymentService {
	
	void processPayment(PaymentMessage message);
}