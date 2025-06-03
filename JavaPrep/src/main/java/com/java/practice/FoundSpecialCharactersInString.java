package com.java.practice;

public class FoundSpecialCharactersInString {
	
	public static void main(String[] args) {
		
		String str = "Cloudtech@#!";
		
		int count = 0;
		
		String filteredString = "";
		for(int i=0; i<str.length(); i++)
		{
			if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
			{
				count++;
			}
			else {
				filteredString = filteredString + str.charAt(i);
			}
		}
		
		System.out.println("Number of Special Characters in a String is " + count);
		System.out.println("After Removing Special Characters from a String is" + filteredString);
		
	}

}
