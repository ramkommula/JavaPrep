package com.java.practice;

import java.util.Arrays;

public class SumOfEvenNumbersInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int result = Arrays.stream(arr).filter(x -> x%2==0).reduce(0, (a,b) -> a+b);
		
		System.out.println(result);
	}

}
