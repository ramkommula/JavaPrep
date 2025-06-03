package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInTwoArraysUsingStream {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {11,2,31,4,5};
		
		List<Integer> resultSet = Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> x==y)).boxed().collect(Collectors.toList());
		
		System.out.println(resultSet);
	}

}
