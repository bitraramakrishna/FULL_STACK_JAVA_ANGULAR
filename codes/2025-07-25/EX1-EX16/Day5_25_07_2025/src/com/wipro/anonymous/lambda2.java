package com.wipro.anonymous;

interface Multiply {
    int multiply(int a, int b);
}
public class lambda2 {
	
	    public static void main(String[] args) {
	        Multiply multiplier = (a, b) -> {
	            return a * b;
	        };

	        int result1 = multiplier.multiply(5, 3);
	        System.out.println("Result of 5 * 3: " + result1);
	    }
}


