package com.java.practice;

public class RotationOfString {
	
	public static void main(String[] args) {
		
		String str1 = "cloudtech";
		String str2 = "techcloud";
		
		if(str1.length() != str2.length())
		{
			System.out.println("String 2 is not a rotation of string 1");
		}
		else {
			str1 = str1 + str1; //cloudtechcloudtech
			if(str1.indexOf(str2) != -1)
			{
				System.out.println("String 2 is a rotation of string 1");
			}
			else {
				System.out.println("String 2 is not a rotation of string 1");
			}
		}
		
		if(str1.contains(str2))
		{
			System.out.println("aaaaaaaa");
		}
	}

}
