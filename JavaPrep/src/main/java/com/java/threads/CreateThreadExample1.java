package com.java.practice.threads;

class MyThread extends Thread {
	//given the thread implementation here
	public void run()
	{
		System.out.println("Thread 1 is Running");
	}
}

public class CreateThreadExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread Started");
		
		//create Thread //Thread implements Runnable Interface
		Thread objThread = new Thread();
		//it will just start Thread and stop, we are not given the implementation of run() method
		objThread.start();
		
		MyThread objThread1 = new MyThread();
		//when this start execute, inside method run() will be triggered.
		objThread1.start();
		
		//Here, we have used the lambda expression to give the implementation of run() method
		Thread objThread2 = new Thread(() -> {
			System.out.println("Thread 2 is Running");
		});
		objThread2.start();
		
		//Runnable interface is a Functional Interface
		//Runnable Functional Interface has one method which is run()
//		Runnable objRunnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Thread 3 is Running");
//				
//			}
//		};
		Runnable objRunnable = () -> {
				System.out.println("Thread 3 is Started");
				//we can capture Thread Name
				System.out.println(Thread.currentThread().getName());
				//we can capture Thread State
				System.out.println(Thread.currentThread().getState());
				try {
					Thread.sleep(2000); //Thread waits 2 seconds to complete task //sleep() method should define with try catch block
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 3 is Completed");
		};
		Thread objThread3 = new Thread(objRunnable, "Runnable Thread");//1. Runnable Object 2. Thread Name
		//This will end the Main Thread without keeping it to wait.
		objThread3.setDaemon(true);
		objThread3.start();
		
		//This will execute(Main Thread End) after Thread 1 and 2 without Thread 3 completion as it is Daemon Thread waiting period with 2 seconds.
		System.out.println("Main Thread Ended");
		
		//Note : here we are keeping Thread 3 waiting for 2 seconds, 
		//So, the Main Thread will still be running until this objThread3 completed.
		//sometimes, we have to run our Threads background without impacting the Main Thread
		//because use case can be you have to do some garbage collection or you just want to monitor your resources or you want to do some logging
		//for that, background task you don't want your Main Thread wait for other Thread.
		//There is a Daemon Thread concept in java, we can specifically set our Thread as Daemon Threads.
		
		
		
	}

}
