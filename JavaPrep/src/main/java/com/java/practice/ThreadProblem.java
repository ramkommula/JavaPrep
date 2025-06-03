package com.java.practice;

public class ThreadProblem {
	
	public static void main(String[] args) {
	    Thread t1 = new Thread(() -> printNumbers());
	    Thread t2 = new Thread(() -> printNumbers());

	    t1.start();
	    t2.start();
	  }

	  public static synchronized void printNumbers() {
	    for (int i = 1; i <= 5; i++) {
	      System.out.print(i + " "); //O/P is 1234512345
	    }
	  }

}
