package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class IntersectionAndUnionOfTwoArrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {2,45,80,20,32,15,77};
		int[] arr2 = {80,40,15,67,19,55};
		
		intersectionOfArrays(arr1, arr2);
		unionOfArrays(arr1, arr2);
	}
	
	static void intersectionOfArrays(int[] arr1, int[] arr2) //Matching Values From Both Arrays.
	{
		Set<Integer> s = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++)
		{
			s.add(arr1[i]);
		}
		System.out.print("Intersection of Arrays ");
		for(int j=0; j<arr2.length; j++)
		{
			if(s.contains(arr2[j]))
			{
				System.out.print(arr2[j] + ", ");
			}
		}
	}
	
	static void unionOfArrays(int[] arr1, int[] arr2) //All the values from both arrays.
	{
		Set<Integer> s = new HashSet<>(); //NOTE : Set does not return any duplicate values & not maintain any insertion order.
		
		for(int i=0; i<arr1.length; i++)
		{
			s.add(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++)
		{
			s.add(arr2[j]);
		}
		
		System.out.println();
		System.out.println("Union of Arrays " + s);
		
	}

}
