package com.java.practice;

public class LengthOfInteger {
	
	public static void main(String[] args) {
		
		int i = 123456;
		
		int count = 0;
		
		while(i>0)
		{
			i = i/10;
			count++;
		}
		
		System.out.println(count);
	}

}
