package com.java.array;

public class OrderArrayBasedOnNumbers {
	
	public static void sort012(int[] arr)
	{
		//Using Dutch National Flag Algorithm
		
		int low=0; //pointer for the next position of 0
		int mid=0; //pointer for the current element
		int high=arr.length - 1; //pointer for the next position of 2
		
		while(mid <= high)
		{
			switch(arr[mid]) {
			case 0:
				swap(arr, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr, mid, high);
				high--;
				break;
		}
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[]= {0, 2, 1, 2, 0};
		sort012(arr);
		
		//Given an array containing only 0s, 1s, and 2s. Sort the array without using any sorting algorithm
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
		
		
	}

}
