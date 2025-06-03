package com.java.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateElementsInIntegerList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,1,2,4,5); //Output is 1,2,4
		
		//First Solution
		list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("------------------");
		
		//Second Solution 
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i) == list.get(j))
				{
					System.out.println(list.get(i));
				}
			}
		}
		
		
	}

}
