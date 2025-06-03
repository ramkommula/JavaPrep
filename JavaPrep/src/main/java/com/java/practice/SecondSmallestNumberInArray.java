package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,2,2,1,3};
		
		List<Integer> resultSet = Arrays.stream(arr).distinct().sorted().skip(1).boxed().collect(Collectors.toList());
		int result = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() ->  new IllegalArgumentException());
		System.out.println(result);
		
		//distinct() method will eliminate duplicates
		//skip() method will eliminate any element through index number
		//boxed() method is an intermediate operation that converts a stream of primitive elements (e.g., int, double, long) 
		//into a stream of corresponding boxed objects (e.g., Integer, Double, Long).
		
		System.out.println(resultSet);
		System.out.println(resultSet.get(0));
	}

}
