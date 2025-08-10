package com.wipro.setdemo;

import java.util.Set;
import java.util.HashSet;

public class set1 {
	
	public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println();
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        Set<Integer> difference1 = new HashSet<>(set1);
        
        difference1.removeAll(set2);

        System.out.println("Difference (Set1 - Set2): " + difference1);

        
        Set<Integer> difference2 = new HashSet<>(set2);
        
        difference2.removeAll(set1);

        System.out.println("Difference (Set2 - Set1): " + difference2);
    }
	

}
