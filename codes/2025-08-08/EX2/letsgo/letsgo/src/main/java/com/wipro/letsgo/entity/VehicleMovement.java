package com.wipro.letsgo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicle_movement")
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class VehicleMovement {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	 	@Column(name = "veh_id")
	    private Integer vehId; 
	    private Double lat;    
	    private Double lon; 
	    
	    @Column(name = "Time_Stamp")
	    private LocalDateTime timestamp; 
	    
	    public VehicleMovement(Integer vehId, Double lat, Double lon) {
	        this.vehId = vehId;
	        this.lat = lat;
	        this.lon = lon;
	        this.timestamp = LocalDateTime.now(); 
	    }

	   
}
