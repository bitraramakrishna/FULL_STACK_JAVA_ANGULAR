package com.wipro.Arraylist2;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class currency {
	
	 public static void main(String[] args) {
	        
	        Map<String, String> currencyMap = new HashMap<>();

	        currencyMap.put("rupee", "india");
	        currencyMap.put("USD", "United States Dollar");
	        currencyMap.put("EUR", "Euro");
	        List<Map.Entry<String, String>> sortedEntries = new ArrayList<>(currencyMap.entrySet());

	        
	       /* Collections.sort(sortedEntries, new Comparator<Map.Entry<String, String>>() {
	            @Override
	            public int compare(Map.Entry<String, String> entry1, Map.Entry<String, String> entry2) {
	                
	                return entry1.getValue().compareTo(entry2.getValue());
	            }
	        });*/

	        
	        System.out.println("Currency Map sorted by Name:");
	        for (Map.Entry<String, String> entry : sortedEntries) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	    }
	 

}
