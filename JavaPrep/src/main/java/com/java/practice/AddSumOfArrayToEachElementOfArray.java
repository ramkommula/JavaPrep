package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddSumOfArrayToEachElementOfArray {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		Integer sumOfList = list.stream().reduce(0, Integer::sum);
		
		System.out.println("Sum of Array is " + sumOfList);
		
		List<Integer> transformedList = list.stream().map(x -> x + sumOfList).collect(Collectors.toList());
		
		System.out.println("Adding Sum Value to Each Array...." + transformedList);
	}

}
