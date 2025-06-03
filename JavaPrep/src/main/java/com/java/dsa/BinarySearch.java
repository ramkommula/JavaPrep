package com.java.dsa;

public class BinarySearch {
	
	//O(log n) Complexity
	public static int  binary_search(int[] arr, int target) {
		
		int left=0; 
		int right = arr.length - 1;
		int mid=(left+right)/2;
		
		while (left <= right)
		{
			if(arr[mid] == target)
				return mid;
			else if(arr[mid]<target)
				return left = mid + 1;
			else
				return right = mid-1;
	    }
		return -1;
				
	}
	
	public static void main(String[] args) {
		
			//Array should be sorted to apply the binary search.
			int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
			System.out.println(binary_search(arr, (70))); //we need to serach 70 is there in array or not?
	}

}
