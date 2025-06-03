package com.java.DailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Two {
	
	public static void main(String[] args) {
		
	        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	        String[] arr = {"Olivia", "Emma", "Sophia", "Evva"};
	        
	        for(int i=0; i<arr.length; i++)
	        {
	        	for(int j=i+1; j<arr.length; j++)
	        	{
	        		if(arr[i].length() == arr[j].length())
	        		{
	        			System.out.println("Length " + arr[i].length() + " Strings " + arr[i] +", " + arr[j] );
	        		}
	        	}
	        }
	        
	        List<String> list = new ArrayList<String>();
	        list.add("Olivia");
	        list.add("Emma");
	        list.add("Sophia");
	        list.add("Evva");
	        
	      Map<Integer,  List<String>> result = list.stream().collect(Collectors.groupingBy(String::length));
	      
	      System.out.println(result);
	      
	      
	      List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	      
	      //li.stream().max(Integer.MAX_VALUE);
	      
	     
	        
	        
	        
	        
		
	}
	
	

}
