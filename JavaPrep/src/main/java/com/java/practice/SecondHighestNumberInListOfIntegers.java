package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumberInListOfIntegers {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10, 5, 8, 2, 7, 11);
		//List<Integer> list = Arrays.asList(1,3,4,5,2);
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(5);
//		list.add(8);
//		list.add(2);
//		list.add(7);
//		list.add(11);
		
		//Collections.sort(num);
		//System.out.println(num.get(num.size() - 2));
		
			
			int highestNum = Integer.MIN_VALUE; // -2147483648
			int secondHighestNumber = Integer.MIN_VALUE;
			
			for(int num : list)
			{
				if(num > highestNum) {
					secondHighestNumber = highestNum;
					highestNum = num;
				}
				if(num > secondHighestNumber && num < highestNum); {
					secondHighestNumber = num;
				}
			}
			
			System.out.println(secondHighestNumber);
			
		
		
		List<Integer> lisa = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(lisa.get(lisa.size() - 2));
		
	}

}
