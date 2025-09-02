package com.wipro.flightms.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.flightms.entity.Flight;
import com.wipro.flightms.service.FlightService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {
	private final FlightService flightService;

    @GetMapping("/search")
    public List<Flight> search(@RequestParam String source,
                               @RequestParam String destination,
                               @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return flightService.searchFlights(source, destination, date);
    }
    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable String id) {
        return flightService.getFlightById(id)
                .orElseThrow(() -> new RuntimeException("Flight not found with id: " + id));
    }


}