package com.wipro.anonymous;

import java.util.function.Predicate;

public class string {
	
	 public static void main(String[] args) {

	        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());

	        String testString1 = "RAMAKRISHNA";
	        String testString2 = "ramakrishna";
	        System.out.println("Is uppercase? " + isUpperCase.test(testString1));
	       
	        System.out.println();
	        System.out.println("Is uppercase? " + isUpperCase.test(testString2));
	        
	       
	    }

}
