package com.java.practice.threads;

public class Stack {
	
	int[] stackArray;
	int stackTop;
	Object lock;
	
	public Stack(int capacity)
	{
		stackArray = new int[capacity];
		stackTop=-1;
		lock = new Object(); // Lock object used to synchronize critical sections
	}
	
	// When multiple threads try to access push() and pop() methods simultaneously,
    // race conditions may occur — such as inconsistent data or unexpected behavior.
    // To prevent this, we synchronize these methods using a lock object.
    // The synchronized block ensures that only one thread can execute the critical
    // section at a time by acquiring the lock.
	
	//when one thread is entered in this lock, until after this thread is executed something 
	//then only other thread will access it
	
	//these pop() and push() methods are bounded by the same synchronized object, therefore 
	//whichever thread is getting access to this lock
	//that thread will only be able to access any of these methods. other threads will have to wait
	//even if these 2 methods are completely different from each other, whichever thread is lock would be able to access that method.
		
		public boolean push(int element)
		{
			//here we are used synchronized block for this particular code
			//we can also make entire method synchronized ---> public synchronized boolean push(int element)
			//In this case synchronized keyword with method will use current class object as lock
			//but remember, synchronized block, we need to defined object lock
			
			//Note : in static methods, we can't use instance of the object - new Object();
			//in this case, directly use Stack.class for synchronized lock ---> synchronized(Stack.class){}
			synchronized(lock) {
				if(isFull()) return false;
				stackTop++;
				try {Thread.sleep(1000);} catch(Exception e) {};
				stackArray[stackTop]=element;
				return true;
			}
		}
		
		public int pop()
		{
			synchronized(lock) {
				if(isEmpty()) return Integer.MIN_VALUE;
				int obj = stackArray[stackTop];
				stackArray[stackTop] = Integer.MIN_VALUE;
				try {Thread.sleep(1000);} catch(Exception e) {};
				stackTop--;
				return obj;
			}
		}
		
	
	public boolean isEmpty()
	{
		return stackTop<0;
	}
	public boolean isFull()
	{
		return stackTop>=stackArray.length - 1;
	}
	
	

}
