package com.java.practice;

import java.util.Arrays;

public class MergingTwoArrays {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,3,2,5};
		int arr2[] = {4,7,9};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int arr3[] = new int[n1 + n2];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i < n1)
		{
			 arr3[k++] = arr1[i++];
		}
		while(j < n2)
		{
			arr3[k++] = arr2[j++];
		}
		
		Arrays.sort(arr3);
		
		System.out.print("After merging Arrays ---> ");
		for(int a=0; a<n1+n2; a++)
		{
			System.out.print(arr3[a] + " ");
		}
	}

}
