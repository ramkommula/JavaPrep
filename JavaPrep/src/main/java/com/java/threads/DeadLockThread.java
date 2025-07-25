package com.java.threads;

public class DeadLockThread {
	
	public static void main(String[] args) {
		
//		Deadlock in Java is a situation where two or more threads are blocked forever, waiting for each other to release locks.
//		It usually happens when:
//
//		1. Multiple threads are trying to acquire locks on shared resources.
//
//		2. They hold one lock and wait for another, but the other thread is also waiting for the first lock.
//		
//		Imagine two people:
//
//		 * Person A has the pen and wants the notebook.
//
//		 * Person B has the notebook and wants the pen.
//
//		 Both wait for each other to release their item — forever. That’s a deadlock.
			
		System.out.println("main is started");
		String lock1 = "Ram";
		String lock2 = "kommula";
		
		Thread thread1 = new Thread(() -> {
			synchronized (lock1) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized (lock2) {
				System.out.println("lock acquired");
			}
		}, "Thread1");
		
		Thread thread2 = new Thread(() -> {
			synchronized (lock2) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized (lock1) {
				System.out.println("lock acquired");
			}
		}, "Thread2");
		
		thread1.start(); thread2.start();
		
		System.out.println("main is exited");
		
		
//		How to Avoid Deadlock?
//			Lock ordering: Always acquire locks in a specific global order. (lock1, lock2) not(lock2,lock1)
//
//			Try-lock with timeout: Use ReentrantLock.tryLock() with timeout to prevent waiting forever.
//
//			Avoid nested locks if possible.
	}

}
