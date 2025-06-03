package com.java.practice;

public class ArmstrongNumberExample {
	
	public static void main(String[] args) {
		
		
		/*
		 * A number that is equal to the sum of its own digits, each raised to the power of the number of digits.
		 */
		
		int input = 153;
		
		System.out.println("Given Number Count is " + numberOfDigitsCount(input));
		
		if(isArmstrong(input))
		{
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("The Number is not Armstrong");
		}
	}
	
	public static boolean isArmstrong(int input)
	{
		int j = input;
		int sum = 0;
		int digit = 0;
		while(j > 0) //153->15->1->0(stop)
		{
			digit = j % 10; //3->5->1
			j = j / 10; //15->1->0
			
			int count = numberOfDigitsCount(input); //Count is 3
			
			//sum = sum + digit * digit * digit; //27 -> 27 + 125 = 152 -> 152 + 1 = 153
			sum = sum + (int) Math.pow(digit, count); //27 -> 27 + 125 = 152 -> 152 + 1 = 153
		}
		return input == sum;
	}
	
	public static int numberOfDigitsCount(int input)
	{
		int i = input;
		int count = 0;
		while(i > 0)
		{
			i = i/10;
			count++;
		}
		return count;
	}

}
