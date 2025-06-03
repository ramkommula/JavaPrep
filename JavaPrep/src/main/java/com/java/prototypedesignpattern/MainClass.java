package com.java.prototypedesignpattern;

import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		ProfessionFactory pf = new ProfessionFactory();
		Profession doc = pf.getProfession("doctor");
		
		doc.print();
		
		 List<Integer> list = Arrays.asList(1,2,3,4,10,5,6,9);
	        int temp;
	        for(int i=0; i<list.size(); i++)
	        {
	            for(int j=i+1; j<list.size(); j++)
	            {
	                if(list.get(i) > list.get(j))
	                {
	                    temp = list.get(i);
	                    list.set(i, list.get(j));
	                    list.set(j, temp);
	                }
	            }
	        }
	        System.out.println(list.get(0));
	        System.out.println(list.get(list.size()-1));
	}

}
