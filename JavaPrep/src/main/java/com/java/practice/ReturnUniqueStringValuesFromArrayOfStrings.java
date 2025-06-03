package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnUniqueStringValuesFromArrayOfStrings {
	
	public static void main(String[] args) {
		
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        
        List<String> list = new ArrayList<>();
        
        list.addAll(Arrays.asList(names1));
        list.addAll(Arrays.asList(names2));
        
        Set<String> set = new HashSet<>();
        
        for(String l : list)
        {
        	set.add(l);
        }
        
        System.out.println(set.size());
        for(String s : set)
        {
        	System.out.println(s);
        }
	}

}
