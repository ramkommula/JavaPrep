package com.java.practice;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		
	/*	In Java, you cannot define ArithmeticException after the standard Exception class. 
	 *  ArithmeticException is a subclass of RuntimeException, which itself is a subclass of Exception.
	 * Since ArithmeticException is already a subclass of Exception, it inherits the properties of Exception, 
	 * and you cannot change its position in the hierarchy or define it after Exception.
	 * 
	 * 
	 * NOTE : You can write try and finally blocks without catch block.
	 * 
	 */
		
		try {
			int i=0;
			i++;
		}
		catch(Exception e) {
			
		}
//		catch(ArithmeticException ex)  //You will got compilation error : Unreachable catch block for ArithmeticException. 
//		{  							   //It is already handled by the catch block for Exception
//		System.out.println("Should avoid dividing by 0 " + ex);  
//		}  
		finally {
			
		}
	}

}
