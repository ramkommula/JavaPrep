package com.java.practice;

public class StarPatternProgram {
	
	public static void main(String[] args) {
		
		int limit =9;
		for(int i=0; i<limit; i++)
		{
			System.out.print(" " + "*" );
			if(i==limit-1)
			{
				limit=limit-2;
				i=0;
				System.out.println();
				System.out.print("   ");
			}
		}
	}

}
