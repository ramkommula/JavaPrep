package com.java.practice;

public class LargestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,4,5,6,8,7,10,9};
		
		int count = arr.length;
		
		int temp = 0;
		
		for(int i=0; i<count; i++)
		{
			for(int j=i+1; j<count; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Largest Number is : " + arr[count-1]);
	}
	

}
