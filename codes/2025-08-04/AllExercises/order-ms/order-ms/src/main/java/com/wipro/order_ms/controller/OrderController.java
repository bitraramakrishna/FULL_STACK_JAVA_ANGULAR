package com.wipro.order_ms.controller;


/*
import com.wipro.order_ms.entity.Order;
import com.wipro.order_ms.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;


class PaymentRequestDto {
    public String orderId;
    public Boolean paymentStatus;
    
    public PaymentRequestDto(String orderId, Boolean paymentStatus) {
        this.orderId = orderId;
        this.paymentStatus = paymentStatus;
    }
}

@RestController
@RequestMapping("/order")
public class OrderController {
	 @Autowired
	    private OrderRepo orderRepo;
	    
	    @Autowired
	    private RestTemplate restTemplate;

	    @PostMapping
	    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
	        // Step 1: Set order status to "I" (Initiated)
	        order.setOrderNumber(UUID.randomUUID().toString());
	        order.setOrderStatus("I");
	        Order savedOrder = orderRepo.save(order);

	        try {
	            // Step 2: Make a call to the payment MS
	            String url = "http://payments/paymentRequest";
	            PaymentRequestDto paymentRequest = new PaymentRequestDto(savedOrder.getOrderNumber(), true);

	            ResponseEntity<String> paymentResponse = restTemplate.postForEntity(url, paymentRequest, String.class);
	            
	            // Step 3: If the call is successful (HTTP status code 200)
	            if (paymentResponse.getStatusCode() == HttpStatus.OK) {
	                savedOrder.setOrderStatus("P"); // Set to "P" (Processed)
	            } else {
	                savedOrder.setOrderStatus("C"); // Set to "C" (Cancelled)
	            }
	        } catch (Exception e) {
	            // Step 3 (Exception case): Update status to "C" if there's an exception
	            System.err.println("Error calling Payment MS: " + e.getMessage());
	            savedOrder.setOrderStatus("C");
	        } finally {
	            // Ensure the order status is saved no matter what happens
	            orderRepo.save(savedOrder);
	        }
	        
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
	    }
	
}
*/


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.order_ms.entity.Order;
import com.wipro.order_ms.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	void save(@RequestBody Order order)
	{
		
		orderService.save(order);
		
		
	}

	@GetMapping
	List<Order> findAll()
	{
		return orderService.findAll();
	}
	
	
}