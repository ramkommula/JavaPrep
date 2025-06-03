package com.java.practice;

public class ReverseExampleUsingString {
	
	public static void main(String[] args) {
		
		String str1 = "Vikram"; //Output : markiV
		String result1 = "";
		for(int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);
			result1 = ch + result1;
		}
		System.out.println(result1);
		System.out.println("--------------------");
		
		
		String str2 = "I am Ram Kommula";  //Output : Kommula Ram am I
		String words1[] = str2.split("\\s");
		String result2="";
		for(String word : words1)
		{
			String temp = word;
			result2 = temp + " " + result2;
		}
		System.out.println(result2);
		System.out.println("--------------------");
		
		
		String str3 = "I am Ram Kommula";  //Output : I ma maR alummoK
		String words2[] = str3.split("\\s");
		String temp = "";
		String result3 = "";
		for(String word : words2)
		{
			for(int i=0; i<word.length(); i++)
			{
				char ch = word.charAt(i);
				temp = ch + temp;
			}
			result3 = result3 + temp + " ";
			temp="";
		}
		System.out.println(result3);
	}

}
