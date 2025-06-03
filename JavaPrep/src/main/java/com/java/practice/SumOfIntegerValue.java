package com.java.practice;

import java.util.Scanner;

public class SumOfIntegerValue {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value ");
		
		int i = sc.nextInt(); //12345
		
		int sum = 0;
		int remainder = 0;
		
		while(i > 0)
		{
			remainder = i%10; //5
			sum = sum + remainder;
			i = i/10; //1234
		}
		System.out.println("Sum of Integer Value is " + sum);
	}

}
