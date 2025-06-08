package com.java.practice.threads;

import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter {
	//private int count;
	AtomicInteger count = new AtomicInteger(0);
	public void increment()
	{
		//count++;
		count.incrementAndGet();
	}
//	public synchronized increment()
//	{
//		count++;
//	}
	public int getCount()
	{
		//return count;
		return count.get();
	}
}
public class Atomic {
	
	public static void main(String[] args)
	{
		SharedCounter sharedCounter = new SharedCounter();
		
		//Thread 1
		new Thread(() -> {
			System.out.println("Thread 1 is Started");
			for(int i=0; i<5000; i++)
			{
				sharedCounter.increment();
			}
			System.out.println("Thread 1 is Completed");
		}).start();
		
		//Thread 2
		new Thread(() -> {
			System.out.println("Thread 2 is Started");
			for(int i=0; i<5000; i++)
			{
				sharedCounter.increment();
			}
			System.out.println("Thread 2 is Completed");
		}).start();
		
		//when 2 threads are working on same shared object, inconsistency can happen
		//In this race condition, you will always get Final Count as less than 10000 rather than actual 10000
		System.out.println("Final Count : " + sharedCounter.getCount());
				
	}

}
