package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaQA {
	
	public static void main(String args[])
	{
		
		int x = 10;
		int y = 5;
		System.out.println(x % y); //0
		
		String str = "Java";
		str.concat("Programming");
		System.out.println(str); //Java
		System.out.println(str.concat(" ").concat("Programming")); //Java Programming
		
		List<Integer> intList = Stream.of(1,2,3,4).map(i -> i*2).collect(Collectors.toList()); 
		System.out.println(intList);  //2,4,6,8
		
		int i;
		for(i=0; i<10; i++)
		{
			continue;
		}
		System.out.println(i); //10
		
		char c='a';
		c++;
		System.out.println(c); //b
		
		byte b = 10;
		System.out.println(b); //10
		
		int z = 4;
		//System.out.println(++(++z)); //Invalid argument ++
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		System.out.println(list.remove(0)); //Java
		
		float a = 35/0;
		System.out.println(a); //Got java.lang.ArithmeticException error at runtime.
		
		
		
		
	}

}
