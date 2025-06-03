package com.java.practice.threads;

public class Thread1 extends Thread{
	
	public Thread1(String threadName)
	{
		super(threadName);
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			//Thread1.currentThread() used to get the instance of the current thread object which will give thread name by getName() method
			System.out.println("Inside Thread1 : " + Thread1.currentThread().getName() + "-" + i);
		}
	}

}
