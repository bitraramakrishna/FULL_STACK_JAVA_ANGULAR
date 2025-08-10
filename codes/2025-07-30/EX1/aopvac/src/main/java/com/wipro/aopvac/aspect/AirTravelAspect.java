package com.wipro.aopvac.aspect;

import org.aspectj.lang.annotation.AfterThrowing;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.wipro.aopvac.exception.NoSeatAvailableException;

@Component
public class AirTravelAspect {
	
	@Before("execution(* com.wipro.aopvac.model.AirTravelProcess.checkIn(..))")
    public void showPhotoId() {
        System.out.println("ADVICE: Showing Photo ID");
    }

    
    @Pointcut("execution(* com.wipro.aopvac.model.AirTravelProcess.doSecurityCheck()) || execution(* com.wipro.aopvac.model.AirTravelProcess.doBoarding())")
    public void securityAndBoardingPointcut() {}

    
    @Before("securityAndBoardingPointcut()")
    public void showBoardingPass() {
        System.out.println("ADVICE: Showing Boarding Pass... ");
    }

    
    @AfterThrowing(
        pointcut = "execution(* com.wipro.aopvac.model.AirTravelProcess.checkIn(..))",
        throwing = "ex"
    )
    public void handleNoSeatException(NoSeatAvailableException ex) {
        System.out.println(ex.getMessage());
        
    }
}
