package com.wipro.Arraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list2 {
	
	public static void main(String[] args) {
        
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(10);
        listWithDuplicates.add(20);
        listWithDuplicates.add(10); 
        listWithDuplicates.add(30);
        listWithDuplicates.add(40);
        listWithDuplicates.add(20); 
        listWithDuplicates.add(50);
        listWithDuplicates.add(30); 

        

        
        Set<Integer> uniqueSet = new HashSet<>(listWithDuplicates);

        
        List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueSet);

        System.out.println("List (without duplicates): " + listWithoutDuplicates);
    }

}
