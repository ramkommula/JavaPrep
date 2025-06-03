package com.java.DailyPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Three {
	
		public static void main(String args[]) throws IOException{
			
			//1st Problem
			int result = 0;
			Three th = new Three();
			Object obj = th;
			
			if(obj == th) //true
			{
				result = 1;
			}
			if(obj != th) //false
			{
				result = result + 10;
			}
			if(obj.equals(th)) //true
			{
				result = result + 100;
			}
			if(th.equals(obj)) //true
			{
				result = result + 1000;
			}
			
			System.out.println("Result : " + result); //O/P : 1101
			
			//2nd Problem
			String values = "Word1 Word2 Word3 Word4";
			String[] val = values.split(" ");
			Arrays.sort(val);
			for(String i : val)
			{
				System.out.print(i); //Word1Word2Word3Word4
			}
			
			//3rd Problem
			IntStream.range(1, 6)
		      .parallel()
		      .forEach(System.out::print); //The output cannot determined (it can be 435241 or 123645 or 162345....etc.
			
			System.out.println();
			System.out.println("---------");
			
		    //4th Problem
			char ch = 'a';
			System.out.println(ch + 0); //O/P is 97
			
			//5th Problem
			byte x = 127;
			x++;
			x++;
			System.out.println(x); //O/P is -127
			int y = 127;
			y++;
			y++;
			System.out.println(y); //O/P is 129
			
			//7th Problem
			int z = 5;
			System.out.println(z++); //5
			System.out.println(++z); //7
			System.out.println(z);   //7
			
			//8th Problem
			int r = 5;
			int s = 10;
			int add = r+++s;
			//int add1 = r++++s; //compilation error
			System.out.println(add); //15
			
			//9th Problem
			int p = 5;
			double q = 2.0;
			double result11 = Math.pow(p, q); //--> 5 * 5 = 25
			System.out.println(result11); //O/P is 25.0
			
		
	  }
		
		//9th Problem
		
		public void display(int a , double b)
		{
			System.out.println(a+b);
		}
		public double display(float r, double s) //double allow any data type..short,int,long,double,float
		{
			return (r+s);
		}
		
		

}
