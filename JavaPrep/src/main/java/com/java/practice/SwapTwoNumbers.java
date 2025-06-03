package com.java.practice;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		 
		int x = 3;
		int y = 5;
		
		System.out.print("before swapping......");
		System.out.println("X = " + x + " Y = " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.print("after swapping......");
		System.out.println("X = " + x + " Y = " + y);
	}

}
