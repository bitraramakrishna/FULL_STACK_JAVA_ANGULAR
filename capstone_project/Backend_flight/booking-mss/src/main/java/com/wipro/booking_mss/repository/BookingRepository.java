package com.wipro.booking_mss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.booking_mss.entity.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
