package com.java.practice;

public class SmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {6,2,3,1,4,5};
		
		int l = arr.length;
		
		int temp = 0;
		
		for(int i=0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Smallest Element in an array is " + arr[0]);
	}

}
