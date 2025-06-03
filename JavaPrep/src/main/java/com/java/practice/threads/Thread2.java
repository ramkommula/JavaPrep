package com.java.practice.threads;

public class Thread2 implements Runnable{

	//Runnable is Functional Interface, with one abstract method run()
	@Override
	public void run() {
		for(int i=0; i<=5; i++)
		{
			System.out.println(Thread.currentThread() + " " + i);
		}
		
	}

}
