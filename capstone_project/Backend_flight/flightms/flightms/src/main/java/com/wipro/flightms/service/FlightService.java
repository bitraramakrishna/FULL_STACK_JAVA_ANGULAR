package com.wipro.flightms.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.wipro.flightms.entity.Flight;

public interface FlightService {
	//BookingResponse response = bookingCircuitBreakerService.bookFlightWithCircuitBreaker(request);

	List<Flight> searchFlights(String source, String destination, LocalDate date);
	Optional<Flight> getFlightById(String id);
}
