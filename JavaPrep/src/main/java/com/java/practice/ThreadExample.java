package com.java.practice;

public class ThreadExample implements Runnable
{
	
	//Q. You have started three threads from main thread.You need to make sure main thread complete last. How will you do it?

	@Override
	public void run() {
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(Thread.currentThread().getName() + " in run method.");
		
	}
	
	public static void main(String[] args) {
		
		ThreadExample th = new ThreadExample();
		Thread t1 = new Thread(th, "T1");
		Thread t2 = new Thread(th, "T2");
		Thread t3 = new Thread(th, "T3");
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Threadis ends here.");
		
	}

}
