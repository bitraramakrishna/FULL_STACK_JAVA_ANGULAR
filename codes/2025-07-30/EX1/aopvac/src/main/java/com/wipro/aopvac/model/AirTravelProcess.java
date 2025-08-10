package com.wipro.aopvac.model;

import com.wipro.aopvac.exception.NoSeatAvailableException;
import org.springframework.stereotype.Component;

@Component 
public class AirTravelProcess {

	  
	    public void checkIn(Boolean flag) throws NoSeatAvailableException {
	        System.out.println("--- Inside checkIn() method ---");
	        if (flag) {
	            System.out.println(" Check-in successful.");
	        } else {
	            
	            throw new NoSeatAvailableException("Sorry, no seats are available for this flight.");
	        }
	    }

	    public void collectBoardingPass() {
	        System.out.println(" Boarding pass collected.");
	    }

	    public void doSecurityCheck() {
	        System.out.println(" Performing security check.");
	    }

	    public void doBoarding() {
	        System.out.println("Boarding the flight.");
	    }
}
