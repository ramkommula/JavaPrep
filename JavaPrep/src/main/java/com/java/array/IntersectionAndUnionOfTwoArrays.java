package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionAndUnionOfTwoArrays {
	
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5,6,7};
		
		unionOfTwoArrays(arr1, arr2);
		interSecionOfTwoArrays(arr2, arr2);
	}
	
	//All the values from both the arrays - Unique values
	public static void unionOfTwoArrays(int[] arr1, int[] arr2)
	{
		//NOTE : Set does not return any duplicate values & not maintain any insertion order.
		Set<Integer> s = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++)
		{
			s.add(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++)
		{
			s.add(arr2[j]);
		}
		System.out.println("Union Of Arrays : " + s);
		s.clear();
		
	}
	
	//Matching values from both the arrays - Unique values
	public static void interSecionOfTwoArrays(int[] arr1, int[] arr2)
	{
		//NOTE : Set does not return any duplicate values & not maintain any insertion order.
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++)
		{
			set.add(arr1[i]);
		}
		
		System.out.print("InterSection of Two Arrays : ");
		for(int j=0; j<arr2.length; j++)
		{
			if(set.contains(arr2[j]))
			{
				System.out.print(arr2[j] + " ");
			}
		}
	}

}
