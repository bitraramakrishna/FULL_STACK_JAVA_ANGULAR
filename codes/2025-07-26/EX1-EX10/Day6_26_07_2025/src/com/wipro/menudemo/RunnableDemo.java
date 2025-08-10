package com.wipro.menudemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnableDemo {
	
	 private static boolean isVowel(char c) {
	        char upperC = Character.toUpperCase(c);
	        return upperC == 'A' || upperC == 'E' || upperC == 'I' || upperC == 'O' || upperC == 'U';
	    }

	    public static void main(String[] args) {
	        List<String> names = new ArrayList<>(Arrays.asList(
	            "Ramakrishna","amit", "Jayanta", "Akassh"
	        ));

	        Runnable capV = () -> {
	            for (int i = 0; i < names.size(); i++) {
	                String name = names.get(i);
	                if (!name.isEmpty() && isVowel(name.charAt(0))) {
	                    String capi = name.toUpperCase();
	                    synchronized (names) {
	                        names.set(i, capi);
	                    }
	                }
	            }
	        };

	        Runnable lowercasenonV = () -> {
	            for (int i = 0; i < names.size(); i++) {
	                String name = names.get(i);
	                if (!name.isEmpty() && !isVowel(name.charAt(0))) {
	                    String lc = name.toLowerCase();
	                    synchronized (names) {
	                        names.set(i, lc);
	                    }
	                }
	            }
	        };

	        Thread vowel = new Thread(capV, "Vowel");
	        Thread nonVowel = new Thread(lowercasenonV, "NonVowel");

	        vowel.start();
	        nonVowel.start();

	        try {
	            vowel.join();
	            nonVowel.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            
	        }

	        System.out.println("Final list " + names);
	    }
	

}
