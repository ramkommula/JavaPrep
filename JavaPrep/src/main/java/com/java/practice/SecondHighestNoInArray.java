package com.java.practice;

import java.util.Arrays;

public class SecondHighestNoInArray {
	
	public static void main(String[] args) {
		
	
		int[] array = {2,32,56,3,76,45,87};
		
		int size = array.length;
		
		Arrays.sort(array);
		
		System.out.println("After Sorting the Array...-2 will give the 2nd Last Value with Index Number");
		System.out.print(array[size-2] + " ");
	
	
	
	}
}
