package com.wipro.basic;

public class strings {
	public static void main(String[] args) {
	/*String text = "Hi , I am Ramakrishna";

    int vowelCount = 0;
    int consonantCount = 0;

    String lowerText = text.toLowerCase();

    for (int i = 0; i < lowerText.length(); i++) 
    {
        char ch = lowerText.charAt(i);

        if (ch >= 'a' && ch <= 'z') 
        { 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
    }

    
    System.out.println("Number of Vowels: " + vowelCount);
    System.out.println("Number of Consonants: " + consonantCount);*/
		
		String sentence = "The quick brown fox";
		String[] words = sentence.split(" ");
		

	        String shortestWord = words[0]; 

	      
	        for (int i = 1; i < words.length; i++) 
	        {
	            if (words[i].length() < shortestWord.length()) 
	            {
	                shortestWord = words[i];
	            }
	        }

	        System.out.println("Shortest word: \"" + shortestWord + "\"");
	    
}

}
