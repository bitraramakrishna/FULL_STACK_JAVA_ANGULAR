package com.wipro.exception;

public class Firstexception {
	 public static void main(String[] args) {
	        String fName = null; 


	        try {
	           
	            String upperCase = fName.toUpperCase();
	            System.out.println("Uppercase name: " + upperCase); 
	        } 
	        catch (NullPointerException e) 
	        {
	           
	            System.out.println("Cannot call method on null object.");
	            
	        }

	        System.out.println("Program continues");
	    }

}
