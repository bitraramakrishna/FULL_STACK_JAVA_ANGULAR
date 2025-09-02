package com.wipro.booking_mss.service;

import java.util.List;

import com.wipro.booking_mss.dto.BookingRequest;
import com.wipro.booking_mss.dto.BookingResponse;
import com.wipro.booking_mss.dto.FlightDTO;
import com.wipro.booking_mss.dto.SearchDTO;
import com.wipro.booking_mss.entity.Booking;

public interface BookingService {
	List<FlightDTO> searchFlights(SearchDTO dto);
    BookingResponse bookFlight(BookingRequest request);
    void updateStatus(Long bookingId, String status);
    Booking getBookingById(Long bookingId);
}
