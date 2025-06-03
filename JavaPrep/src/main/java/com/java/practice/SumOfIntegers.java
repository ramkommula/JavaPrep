package com.java.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfIntegers {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		int sum = 0;
		for(int i=0; i<nums.length; i++)
		{
			sum += nums[i]; //Output is 15
			//sum = sum + nums[i]; //Output is 15
		}
		System.out.println(sum);
		
	}

}
