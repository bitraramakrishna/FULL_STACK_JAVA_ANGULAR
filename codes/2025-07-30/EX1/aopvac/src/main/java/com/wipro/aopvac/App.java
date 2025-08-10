package com.wipro.aopvac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.aopvac.model.AirTravelProcess;

public class App 
{
	public static void main(String[] args) {
       
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
    	ctx.scan("com.wipro.aopvac.*");
    	ctx.refresh();
        AirTravelProcess travelProcess = ctx.getBean(AirTravelProcess.class);

        
        try {
            travelProcess.checkIn(true); 
            travelProcess.collectBoardingPass();
            travelProcess.doSecurityCheck();
            travelProcess.doBoarding();
        } catch (Exception ex) {
            System.out.println("Main App Catch Block: " + ex.getMessage());
        }

        
        System.out.println("No Seat Available");
        
        try {
            travelProcess.checkIn(false); 
            
            travelProcess.collectBoardingPass();
            travelProcess.doSecurityCheck();
            travelProcess.doBoarding();
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }
}
