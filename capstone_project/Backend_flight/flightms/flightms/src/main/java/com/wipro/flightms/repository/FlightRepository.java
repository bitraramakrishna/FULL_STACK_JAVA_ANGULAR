package com.wipro.flightms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.flightms.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
	List<Flight> findBySourceAndDestinationAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
            String source, String destination, LocalDate date1, LocalDate date2);

}
