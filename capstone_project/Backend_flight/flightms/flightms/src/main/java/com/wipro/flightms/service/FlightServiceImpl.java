package com.wipro.flightms.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.flightms.entity.Flight;
import com.wipro.flightms.repository.FlightRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService{
	private final FlightRepository flightRepository;
	/* private final BookingCircuitBreakerService bookingCircuitBreakerService;

	    public FlightServiceImpl(BookingCircuitBreakerService bookingCircuitBreakerService) {
	        this.bookingCircuitBreakerService = bookingCircuitBreakerService;
	    }*/
    @Override
    public List<Flight> searchFlights(String source, String destination, LocalDate date) {
        return flightRepository.findBySourceAndDestinationAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                source, destination, date, date);
    }
    @Override
    public Optional<Flight> getFlightById(String id) {
        return flightRepository.findById(id);
    }


}
