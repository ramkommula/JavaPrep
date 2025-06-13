package com.java.threads;

public class ThreadTester {
	
	public static void main(String[] args)
	{
		System.out.println("Main is Starting");
		
		Thread1 thread1 = new Thread1("Thread1");
		//by default daemon thread is false
		//thread.setDaemon(true);
		thread1.start();
		
		//Thread thread2 = new Thread(new Thread2(), "Thread2");
//		Thread thread2 = new Thread(() -> {
//			for(int i=0; i<=5; i++)
//			{
//				System.out.println(Thread.currentThread() + " " + i);
//			}
//		}, "Thread2");
//		thread2.start();
		
		//there is no particular order while executing any thread, it's purely JVM choice at the time of execution 
		//Note : A program will only run if there is no user threads are terminating.
		//even if there are a couple of daemon threads running but no user threads running, the program might terminate
		//If user thread dies then daemon thread has no significance.
		
		//As thread is implementing the runnable interface, we can directly call the run() method.
		//Thread class is an object of runnable interface
		new Thread().run();
		
		
		Stack stack = new Stack(5);
		new Thread(() -> {
			int counter=0;
			while(++counter < 10)
			{
				System.out.println("Pushed: " + stack.push(100));
			}
			
		}, "Pusher").start();
		
		new Thread(() -> {
			int counter=0;
			while(++counter < 10)
			{
				System.out.println("Popped: " + stack.pop());
			}
			
		}, "Popper").start();
		
		System.out.println("Main is Exiting.");
	}

}
