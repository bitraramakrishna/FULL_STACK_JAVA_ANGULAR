package com.wipro.uber.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.uber.dto.Ride;
import com.wipro.uber.entity.AcceptedRide;
import com.wipro.uber.repo.AcceptedRideRepo;
import com.wipro.uber.util.AppConstant;
@Service
public class UberServiceImpl implements UberService{
	 @Autowired
	    AcceptedRideRepo repo;

	    @Autowired
	    KafkaTemplate<String, Ride> kafkaTemplate;

	    @Override
	    @KafkaListener(topics = AppConstant.INCOMING_TOPIC_NAME, groupId = "uber_group", containerFactory = "kafkaListenerContainerFactory")
	    public void processRide(Ride ride) {
	        System.out.println("[Uber] Received ride: " + ride);
	        AcceptedRide a = new AcceptedRide();
	        a.setPassengerName(ride.getRiderName());
	        a.setPickupLocation(ride.getPickup());
	        a.setDropLocation(ride.getDropLocation());
	        a.setStatus("ACCEPTED");
	        a.setTimestamp(LocalDateTime.now());
	        AcceptedRide saved = repo.save(a);

	        // send update back with original id so Rider can correlate
	        Ride resp = new Ride();
	        resp.setId(ride.getId());
	        resp.setRiderName(saved.getPassengerName());
	        resp.setPickup(saved.getPickupLocation());
	        resp.setDropLocation(saved.getDropLocation());
	        resp.setStatus(saved.getStatus());
	        resp.setTimestamp(saved.getTimestamp());

	        kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, resp);
	    }
}
