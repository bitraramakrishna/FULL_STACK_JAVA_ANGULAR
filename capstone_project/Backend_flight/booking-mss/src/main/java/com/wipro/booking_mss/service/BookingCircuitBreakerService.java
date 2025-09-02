/*package com.wipro.booking_mss.service;

import org.springframework.retry.annotation.CircuitBreaker;

import com.wipro.booking_mss.dto.BookingRequest;
import com.wipro.booking_mss.dto.BookingResponse;

public class BookingCircuitBreakerService {
	 private final BookingClient bookingClient;

	    public BookingCircuitBreakerService(BookingClient bookingClient) {
	        this.bookingClient = bookingClient;
	    }

	    @CircuitBreaker(name = "bookingService", fallbackMethod = "bookingFallback")
	    public BookingResponse bookFlightWithCircuitBreaker(BookingRequest request) {
	        return bookingClient.bookFlight(request);
	    }

	    public BookingResponse bookingFallback(BookingRequest request, Throwable t) {
	        BookingResponse response = new BookingResponse();
	        response.setStatus("FAILED");
	        response.setMessage("Booking service is currently unavailable. Please try again later.");
	        return response;
	    }
}
*/