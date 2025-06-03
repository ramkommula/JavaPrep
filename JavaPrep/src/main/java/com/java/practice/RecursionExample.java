package com.java.practice;

public class RecursionExample {
	
	//Recursion is the technique of making function call itself multiple times.
	
	public static void main(String[] args) {
		
		int result = sum(10);
		System.out.println(result); // Result is 55
		
	}
	
	static int sum(int k)
	{
		if(k > 0)
		{
			return k + sum(k-1); //10 + sum(9) --> 
		}
		else {
			return 0;
		}
	}

}
