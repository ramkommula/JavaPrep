package com.java.practice;

public class EvenOddNumbersInArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7,8};
		
		int[] arr2 = new int[arr1.length];
		
		int count=0;
		
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2 == 0)
			{
				arr2[count] = arr1[i];
				count++;
			}
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2 != 0)
			{
				arr2[count] = arr1[i];
				count++;
			}
		}
		
		for(int j=0; j<arr2.length; j++)
		{
			System.out.print(arr2[j] + " ");
		}
	}

}
