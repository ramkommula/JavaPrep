package com.java.array;

public class FindKthSmallestArray {
	
	public static void main(String[] args)
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		int temp;
		
		//Sorting the Array
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Finding the K^th Largest Element
		System.out.println(arr[k-1]);
	}

}
