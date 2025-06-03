package com.java.array;

public class MoveNegativesToEndInArray {
	
	public static void MoveNegativesToEnd(int[] arr)
	{
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >= 0)
			{
				swap(arr, i, j);
				j++;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
		MoveNegativesToEnd(arr);
		
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
	}

}
