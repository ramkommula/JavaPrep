package com.java.practice;

public class ConvertHalfStringLowerCaseAndHalfStringUpperCase {
	
	public static void main(String[] args) {
		
		String str = "i am ram i am ram";
		
		int mid = str.length() / 2;
		
		String lowerCase = "";
		String upperCase = "";
		
		for(int i=0; i<str.length(); i++)
		{
			if(i < mid)
			{
				lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
			}
			else {
				upperCase = upperCase + Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println("Lowercase String is : " + lowerCase);
		System.out.println("Uppercase String is : " + upperCase);
		
	}

}
