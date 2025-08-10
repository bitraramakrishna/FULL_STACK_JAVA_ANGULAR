package com.wipro.anonymous;

import java.util.function.Predicate;

public class palindromecheck {
	    public static void main(String[] args) {

	        Predicate<String> isPalindrome = str -> {
	            
	            String Str = str.toLowerCase().replaceAll("", "");

	            String reversedStr = new StringBuilder(Str).reverse().toString();

	            
	            return Str.equals(reversedStr);
	        };

	        String testString1 = "rotor";
	        System.out.println(isPalindrome.test(testString1));
	       
	    
	}

}
