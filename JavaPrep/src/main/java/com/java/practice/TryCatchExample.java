package com.java.practice;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("In try Block");
			int a,b;
			a=3; b=3;
			int c = a/b;
			System.out.println(c);
			//System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("In Catch Block");
		}
		finally {
			System.out.println("In Finally Block.");
		}
	}

}
