package com.java.practice;

public class IncerementAndDecrement {
	
	public static void main(String[] args) {
		
		//Pre-Increment(++i) --> first, the value is incremented by 1 & then it is assigned.
		//Post-Increment(i++) --> first, the value is assigned after that it is incremented by one
		
		//Same as Pre-Decrement and Post-Decrement
		
		int i =3;
		
		int a = i++;
		System.out.println(a + " " + i); // a=3, i=4
		
		int b = ++i;
		System.out.println(b + " " + i); //b=5, i=5
		
		int c=++a;
		System.out.println(c + " " + a); //c=4, a=4
		
		int d=c++;
		System.out.println(d + " " + c); //d=4, c=5
	}

}
