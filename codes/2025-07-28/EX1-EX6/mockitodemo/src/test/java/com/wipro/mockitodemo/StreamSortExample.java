	package com.wipro.mockitodemo;

	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class StreamSortExample {

	    public static void main(String[] args) {
	        
	        List<String> unNames = Arrays.asList(
	            "ramakrishna", "prasad", "kohli", "David" 
	        );

	        List<String> sortedNames = unNames.stream()
	                                                 .sorted(String::compareTo) 
	                                                 .collect(Collectors.toList());

	        
	        System.out.println("Sorted List (case-sensitive): " + sortedNames);

	        
	    }
	

}
