package com.wipro.letsgo.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repository.VehicleMovementRepository;

@RestController
public class MovementController {
	 @Autowired
	    private VehicleMovementRepository vehicleMovementRepository;
	 	
	 @GetMapping("/move")
	    public List<VehicleMovement> getAllMovements() {
	        
	        return vehicleMovementRepository.findAll();
	    }
	    @PostMapping("/move")
	    public ResponseEntity<?> recordMovement(@RequestBody Map<String, Object> payload) {
	        
	        Integer vehId = (Integer) payload.get("vehId");
	        Double lat = (Double) payload.get("lat");
	        Double lon = (Double) payload.get("long"); 
	        if (vehId == null || lat == null || lon == null) {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }
 
	        VehicleMovement movement = new VehicleMovement(vehId, lat, lon);

	        VehicleMovement savedMovement = vehicleMovementRepository.save(movement);
	       
	       
	        return new ResponseEntity<>(savedMovement, HttpStatus.CREATED); 
	    }
}
