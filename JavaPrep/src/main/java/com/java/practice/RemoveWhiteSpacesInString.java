package com.java.practice;

public class RemoveWhiteSpacesInString {
	
	public static void main(String[] args) {
		
		String str = "I am Ram Kommula";
		
		String str1 = str.replaceAll("\\s", "");
		
		System.out.println("Using replace() method " + str1);
		
		char[] ch = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] != ' ' && ch[i] != '\t')
				
			{
				sb.append(ch[i]);
			}
		}
		String str2 = sb.toString();
		System.out.println("Without using replace() method " + str2);
	}

}
