package com.java.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMaxValuesInArrayUsingStreamsNdforloop {
	
	public static void main(String args[])
	{
		
		int[] arr = {3,1,2,4,5,6,8,7,10,9};
		
		//Using Stream
		OptionalInt min = Arrays.stream(arr).min();
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("Min Value is : " + min.getAsInt());
		System.out.println("Max Value is : " + max.getAsInt());
		
		//Using for loop
		int temp =0;
		int count = arr.length;
		
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
		
		System.out.println("Min Value is : " + arr[0]);
		System.out.println("Max Value is : " + arr[count-1]);
		
	}

}
