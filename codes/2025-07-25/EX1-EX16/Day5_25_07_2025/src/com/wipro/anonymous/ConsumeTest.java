package com.wipro.anonymous;

import java.util.function.Consumer;

public class ConsumeTest {
	
	 public static void main(String[] args) {
	        Consumer<Integer> NEven = number -> {
	            int nextEven=number % 2 == 0?number + 2:number + 1;
	           
	            System.out.println( nextEven);
	        };

	        NEven.accept(5);   
	        NEven.accept(100);  
	 } 

}
