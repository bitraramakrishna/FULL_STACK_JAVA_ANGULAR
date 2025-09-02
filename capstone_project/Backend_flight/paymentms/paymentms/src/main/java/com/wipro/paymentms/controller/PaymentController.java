package com.wipro.paymentms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.paymentms.dto.PaymentMessage;
import com.wipro.paymentms.service.PaymentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {
	private final PaymentService paymentService;

    @PostMapping("/simulate")
    public String simulatePayment(@RequestBody PaymentMessage message) {
        paymentService.processPayment(message);
        return "Payment processed (simulated)";
    }

}
