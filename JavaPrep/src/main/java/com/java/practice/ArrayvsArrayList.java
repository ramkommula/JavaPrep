package com.java.practice;

import java.util.ArrayList;

public class ArrayvsArrayList {
	
public static void main(String[] args) {
		
		//Arrays Action
		String myList[] = new String[5];
		String a = new String("Ram");
		myList[0] = a;
		System.out.println("Arrays length --->" + myList.length); //5
		System.out.println("Get one of Array Element --->" + myList[0]); //Ram
		boolean test = false;
		for(String st : myList)
		{
			if(st.contains(a))
			{
				test = true;
				System.out.println(test);  //true
				break;
			}
		}
		
		//ArrayList Action
		ArrayList<String> arraylist = new ArrayList<>();
		String b = new String("Kommula");
		arraylist.add(b);
		System.out.println("ArrayList length ---> " + arraylist.size()); //1
		System.out.println("get one of ArrayList element ---> " + arraylist.get(0)); //Kommula
		for(String st1 : arraylist)
		{
			if(st1.contains(b))
			{
				test = true;
				System.out.println(test); //true
				break;
			}
		}
	
	

}
}
