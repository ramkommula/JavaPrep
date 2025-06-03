package com.java.practice;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,1,3,4,5};
		
		if(equalityCheck(arr1, arr2))
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	
	public static boolean equalityCheck(int[] arr1, int[] arr2)
	{
		//Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=i+1; j<arr1.length; j++)
			{
				if(arr1[i] > arr1[j])
				{
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
			if(arr1.length != arr2.length)
			{
				return false;
			}
			for(int k=0; k < arr1.length; k++)
			{
				if(arr1[k] != arr2[k])
				{
					return false;
				}
			}
			return true;
	}

}
