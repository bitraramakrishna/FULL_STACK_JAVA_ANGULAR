package com.wipro.exception;

public class Throwdemo {
	
		
		public int divide(int numerator, int denominator) throws ArithmeticException {
	        if (denominator == 0) {
	        
	            throw new ArithmeticException("Cannot divide by zero!");
	        }
	        return numerator / denominator;
	    }
		
	

}
