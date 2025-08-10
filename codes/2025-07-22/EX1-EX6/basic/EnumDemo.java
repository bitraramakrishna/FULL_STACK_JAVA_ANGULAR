package com.wipro.basic;

import java.util.Arrays;

public class EnumDemo {
	
	public static void main(String[] args) {
	/*    enum Month {
	        jan,
	        feb,
	        mar,
	        apr,
	        may,
	        jun,
	        july,
	        aug,
	        sept,
	        oct,
	        nov,
	        dec
	    }

	    public static void main(String[] args) { 
	       
	        Month month = Month.feb;

	        
	        if (month == Month.feb) {
	            System.out.println("FEBRUARY");
	        }
	        
	        System.out.println("\nAll Months:"); 
	        for (Month d : Month.values()) { 
	            System.out.println(d);
	        }
	    }*/
	
	/*String inputString = "madam";

    boolean isPalindrome = true;
    int length = inputString.length(); 

    for (int i = 0; i < length / 2; i++) {
     
        if (inputString.charAt(i) != inputString.charAt(length - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) 
    {
        System.out.println(" palindrome.");
    } 
    else 
    {
        System.out.println("not a palindrome.");
    }
		String inputString = "Madam"; 

        String lowerCaseInput = inputString.toLowerCase(); 
        StringBuilder sb = new StringBuilder(lowerCaseInput);
        String reversedString = sb.reverse().toString();

        if (lowerCaseInput.equals(reversedString)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
	    */
		 String str1 = "listen";
	        String str2 = "silent";

	        String s1 = str1.toLowerCase();
	        String s2 = str2.toLowerCase();

	        if (s1.length() != s2.length()) {
	            System.out.println("'" + str1 + "' and '" + str2 + "' are NOT anagrams.");
	        } else {
	            char[] charArray1 = s1.toCharArray();
	            char[] charArray2 = s2.toCharArray();

	            Arrays.sort(charArray1);
	            Arrays.sort(charArray2);

	            if (Arrays.equals(charArray1, charArray2)) {
	                System.out.println(str1 + " and " + str2 + " ARE anagrams");
	            } else {
	                System.out.println("'" + str1 + "' and '" + str2 + "' are NOT anagrams.");
	            }
	        }
	}
}