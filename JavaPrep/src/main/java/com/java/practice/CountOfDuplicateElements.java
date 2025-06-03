package com.java.practice;

import java.util.Arrays;
import java.util.List;

public class CountOfDuplicateElements {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,0,1,0,1,0,1,1,1,0,0);
		
		int listSize = list.size();
		
		Integer onesCount = list.stream().reduce(0, Integer::sum);
		
		System.out.println("1's Count is : " + onesCount);
		
		int zerosCount = listSize - onesCount;
		
		System.out.println("0's Count is : " + zerosCount);
	}

}
