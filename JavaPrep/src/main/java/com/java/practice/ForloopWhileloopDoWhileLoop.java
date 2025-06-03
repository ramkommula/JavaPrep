package com.java.practice;

public class ForloopWhileloopDoWhileLoop {
	
	
	public static void main(String[] args) {
		//In Java for loop is used to iterate a part of program several times.
		//if the number of iteration is fixed, it is recommended to use for loop.
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//In Java while loop is used to iterate a part of program several times.
		//if the number of iteration is not fixed, it is recommended to use while loop.
			while(true){  
				System.out.println("While loop");
				break;
			}
		//In Java do-while loop is used to iterate a part of program several times.
		//use it if the number of iteration is not fixed and you must have to execute the loop at least once.
			 int i=1;    
			 do{    
			    System.out.println(i);    
			    i++;    
			 }
			 while(i<=10);  
		
	}

}
