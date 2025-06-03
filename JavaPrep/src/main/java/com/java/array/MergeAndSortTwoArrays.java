package com.java.array;

public class MergeAndSortTwoArrays {
	
	public static void main(String[] args)
	{
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {0, 2, 6, 8, 9};
		
		int[] temp = new int[arr1.length + arr2.length];
		int k=0;
		int z=0;
		
		for(int i : arr1)
		{
			temp[k] = i;
			k++;
		}
		for(int j : arr2)
		{
			temp[k] = j;
			k++;
		}
		
		for(int i=0; i<temp.length; i++)
		{
			for(int j=i+1; j<temp.length; j++)
			{
				if(temp[i] > temp[j])
				{
					z=temp[i];
					temp[i]=temp[j];
					temp[j]=z;
				}
			}
		}
		
		
		
		for(int b : temp)
		{
			System.out.print(b + " ");
		}
	}

}
