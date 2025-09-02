package com.wipro.paymentms.service;

import java.util.Random;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.paymentms.dto.PaymentMessage;
import com.wipro.paymentms.dto.PaymentStatus;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService{
	private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void processPayment(PaymentMessage message) {
        try {
            String status = new Random().nextBoolean() ? "Successful" : "Failed";
            PaymentStatus response = new PaymentStatus(message.getBookingId(), status);
            String result = new ObjectMapper().writeValueAsString(response);
            kafkaTemplate.send("T2", result);
        } catch (Exception e) {
            throw new RuntimeException("Error processing payment", e);
        }
    }

}
