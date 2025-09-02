package com.wipro.paymentms.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.paymentms.dto.PaymentMessage;
import com.wipro.paymentms.service.PaymentService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PaymentListener {
	 private final PaymentService paymentService;

	    @KafkaListener(topics = "T1", groupId = "payment-group")
	    public void listen(String message) throws Exception {
	        ObjectMapper mapper = new ObjectMapper();
	        PaymentMessage msg = mapper.readValue(message, PaymentMessage.class);
	        paymentService.processPayment(msg);
	    }

}
