package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithCountInArray {

	public static void main(String[] args) {
		
		//Using Loops
		int[] arr = {1,2,3,4,5,6,1,2,3,1,3};
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(int num : arr)
		{
			//getOrDefault() method is from java Map interface
			//It will retrieve the value associated with the key
			//Here, Initially key(num) is 1 but it is not stored in countMap
			//So, it will pick 0 because key(num) and it's respective value is not added in countMap at starting level
			//then we are adding +1 to 0 --> 0+1=1 value will be added with key(num)(key is also 1) in countMap
			//next time, if same key(1) comes, this time value is already present for key(1)
			//which will pick the value(1) for key(1) and adding +1 to value(1) --> 1+1=2
			//for key(1), value will become 2. (key 1 is associated with value 2)
			//that means key(1) is repeated in 2 times in our case.
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> map : countMap.entrySet())
		{
			if(map.getValue() > 1)
			{
				System.out.println("Number " + map.getKey() + " Repeated " + map.getValue() + " Times");
			}
		}
		
		//Using Streams
		Map<Integer, Long> frequencyMap = Arrays.stream(arr)
				.boxed() //convert IntStream to Stream<Integer>
				.collect(Collectors.groupingBy(
						Function.identity(), //Group by the number itself
						Collectors.counting() //count occurrences
						));
		
		frequencyMap.entrySet().stream()
		.filter(entry -> entry.getValue() > 1) //Filter Duplicates
		.forEach(entry -> System.out.println("Number " + entry.getKey() + " Repeated " + entry.getValue() + " Times"));

	}

}
