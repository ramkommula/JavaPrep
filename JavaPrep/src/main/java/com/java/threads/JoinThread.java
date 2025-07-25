package com.java.threads;

public class JoinThread {
	
	public static void main(String[] args) {
		
		//Generally, The Thread we are created and main thread will run parallelly
		//if wanted to run one thread at a time we can use join() method
		
		System.out.println("main is starting");
		Thread thread = new Thread(() -> {
			System.out.println(Thread.currentThread());
		}, "Our Thread");
		
		thread.start();
		
		try {
			//whenever we call this thread.join(), all it's child threads will complete first then the program
			//execution part will continue (means main thread will continue)
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main is exiting");
	}

}
