package com.wipro.order_ms.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="order_data")
@Data
public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;
	    
	    @Column(name = "order_Number")
	     String orderNumber;
	    
	    @Column(name = "order_Value")
	     Double orderValue;
	    
	    @Column(name = "order_Status")
	     String orderStatus;
	}

