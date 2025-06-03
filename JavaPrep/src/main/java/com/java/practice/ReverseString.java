package com.java.practice;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String string = "Ram Kommula", output="";
		
		for(int i=0; i<string.length(); i++)
		{
			char ch = string.charAt(i); //extracts each character 
			 output = ch + output; //adds each character in front of the existing string 
		}
		System.out.println(output);
	}

}
