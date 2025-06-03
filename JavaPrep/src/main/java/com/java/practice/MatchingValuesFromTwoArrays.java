package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingValuesFromTwoArrays {
	
public static void main(String[] args) {
		
		//return InterSection of Two Arrays  O/P - 1,2
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5,6};
		
		List<Integer> arr3 = Arrays.asList(1,2,3,4);
		List<Integer> arr4 = Arrays.asList(1,2,5,6);
		
		List<Integer> arr5 = new ArrayList<>();
		arr5.add(1);
		arr5.add(2);
		arr5.add(3);
		arr5.add(4);
		
		List<Integer> arr6 = new ArrayList<>();
		arr6.add(1);
		arr6.add(2);
		arr6.add(5);
		arr6.add(6);
		
		//Int Array 
		Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> x == y)).distinct().forEach(System.out::println);
		
		//Integer List of Array
		arr3.stream().filter(x -> arr4.stream().anyMatch(y->x==y)).distinct().forEach(System.out::println);
		
		//Integer List of Array
		arr5.stream().filter(x -> arr6.stream().anyMatch(y->x==y)).distinct().forEach(System.out::println);
		
		System.out.println("-----------------Without Stream------------------");
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=i+1; j<arr1.length; j++)
			{
				if(arr1[i] < arr1[j])
				{
					arr1[i] = arr1[i];
					arr1[j] = arr1[j];
				}
			}
		}
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=i+1; j<arr2.length; j++)
			{
				if(arr2[i] < arr2[j])
				{
					arr2[i] = arr2[i];
					arr2[j] = arr2[j];
				}
			}
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		
	}

}
