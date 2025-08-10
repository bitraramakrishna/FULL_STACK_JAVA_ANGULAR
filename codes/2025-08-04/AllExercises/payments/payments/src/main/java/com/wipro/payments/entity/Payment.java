package com.wipro.payments.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="payment")
@Data
public class Payment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;
	    
	    @Column(name = "order_id")
	    String orderId;
	    
	    @Column(name = "payment_status")
	     Boolean paymentStatus;
	    
	    @Column(name="payment_amount")
		double paymentAmount;
}
