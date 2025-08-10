package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	/*public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta","Jnanendra ","ramakrishna");

        List<String> namesWithJa = names.stream()
            
            .filter(name -> name.toLowerCase().contains("ja"))
            
            .collect(Collectors.toList());

        System.out.println(namesWithJa);
    }*/
	
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 20, 30);

	        
	        double avg = numbers.stream()
	                                .collect(Collectors.averagingDouble(Integer::doubleValue));

	        System.out.println("Average number: " + avg);

	       
	    }
	
	

}
