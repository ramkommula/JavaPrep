package com.java.array;

public class ReverseArray {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		
		int arrLength = arr.length;
		
		int[] temp = new int[arrLength];
		
		for(int i=0; i<arrLength; i++)
		{
			temp[i] = arr[arrLength - i - 1];
		}
		
		for(int j=0; j<arrLength; j++)
		{
			System.out.println("Array in reverse : " + temp[j]);
		}
		
		
	}

}
