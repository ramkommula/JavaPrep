package com.java.practice;

public class ReverseArray {
	
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		
		int l = a.length;
		int j = l;
		
		int b[] = new int[l];
		
		for(int i=0; i<l; i++)
		{
			b[j-1] = a[i];
			j=j-1;
		}
		System.out.print("Reverse of Arrays ");
		for(int k=0; k<l; k++)
		{
			System.out.print(b[k] + " ");
		}
		
		
		
		
	}

}
