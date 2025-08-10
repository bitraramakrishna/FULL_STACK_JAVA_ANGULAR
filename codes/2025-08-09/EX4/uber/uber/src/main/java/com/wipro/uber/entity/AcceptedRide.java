package com.wipro.uber.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data 
@Table(name = "accepted_ride")
public class AcceptedRide {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "passenger_name")
    private String passengerName;
    @Column(name = "pickup_location")
    private String pickupLocation;
    @Column(name = "drop_location")
    private String dropLocation;
    private String status;
    @Column(name = "time_stamp")
    private LocalDateTime timestamp;
}
