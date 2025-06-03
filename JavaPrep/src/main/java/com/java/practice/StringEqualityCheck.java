package com.java.practice;

public class StringEqualityCheck {
	
	public static void main(String[] args) {
		
		String str1 = "Abc"; //Stored in String Constant Pool
		String str2 = "Abc"; //Stored in String Constant Pool 
		String str3 = new String("Abc"); //Stored in Heap Memory
		String str4 = new String("abc"); //Stored in Heap Memory
		
		//'==' Operator will check Address of the String
		//equals() method will check Content of the String
		
		System.out.println(str1 == str2); //True 
		System.out.println(str1 == str3); //False
		System.out.println(str3 == str4); //False
		
		System.out.println(str1.equals(str2)); //True
		System.out.println(str1.equals(str3)); //True
		System.out.println(str3.equals(str4)); //False
		System.out.println(str3.equalsIgnoreCase(str4)); //True
	}

}
