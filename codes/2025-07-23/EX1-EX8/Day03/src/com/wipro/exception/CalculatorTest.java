package com.wipro.exception;
import com.wipro.exception.Throwdemo;
public class CalculatorTest {
	 public static void main(String[] args) {
		 Throwdemo calc = new Throwdemo();

	      
	        try {
	            int result = calc.divide(10, 0); 
	            System.out.println("Result: " + result); 
	        } catch (ArithmeticException e) {
	            
	            System.out.println("Error caught: " + e.getMessage());
	        }

	        System.out.println("Program finished.");
	    }

}
