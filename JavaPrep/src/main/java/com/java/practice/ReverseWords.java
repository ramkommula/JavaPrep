package com.java.practice;

public class ReverseWords {
	
	public static void main(String[] args) {
		
        String str = "I Know Java";
        
        // splitting String str with a pattern 
        String[] words = str.split("\\s");  // ---> \\s indicates white space. (Split at white space.)
        String result = ""; 
        
        //String[0] = "I";
        //String[1] = "Know";
        //String[2] = "Java";
        // words.length = 3;
 
        // Iterate over the words array and store in result
        for (int i = 0; i < words.length; i++) { 
        	
                result = " " + words[i] + result; 
        } 
        System.out.println(result);
	}

}
