package com.java.practice;

import java.util.Arrays;

public class LengthofLongestStringInArray {
	
	public static void main(String[] args) {
		
		String[] arr = {"Apple", "Banana", "Goa", "Pineapple"};
		
		int result = Arrays.stream(arr).mapToInt(String::length).max().orElse(0);
		System.out.println(result);
	}

}
