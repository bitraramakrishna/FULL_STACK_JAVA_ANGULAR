package com.wipro.flightms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	@Id
    private String flightId;
    private String airline;
    private String source;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    private double price;

}
