package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	
	public static void main(String[] args)
	{
		int[] arr = {1,1,2,3,1,4,5,4};
		
		Set<Integer> uniqueElements = new HashSet();
		Set<Integer> duplicateElements = new HashSet();
		
		for(Integer i: arr)
		{
			//uniqueElements.add(i) method gives false if the duplicate element came then the below condition will be satisfied
			if(!uniqueElements.add(i))
			{
				duplicateElements.add(i);
			}
		}
		
		System.out.println("Duplicate Elements : " + duplicateElements);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] temp = new int[arr.length];
		int k=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					temp[k] = arr[i];
					k++;
					break;
				}
			}
		}
		
		System.out.print("Duplicate Elements : ");
		for(int i : temp)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
