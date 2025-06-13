package com.java.threads;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	
	//this is all about booking seats in theatre, when multiple requests came to book a particular seat,
	//that means multiple threads are accessing same resource
	//there we need to handle these requests not to cause inconsistency in data 
	
	private Queue<Integer> q;
	private int capacity;
	public BlockingQueue(int cap)
	{
		q = new LinkedList<>();
		//capacity indicates that these many seats are available to book
		capacity = cap;
	}
	
	//Here, we added synchronized blocks for both add and remove method
	//that means, one method at a time can only access and do the operations on particular Queue q
	
	//Adds an item to the queue.
    //If the queue is full, the thread will wait until space becomes available.
	public boolean add(int item)
	{
		//we are using Queue q object as our lock
		synchronized(q) {
			//If Queue q size is reaches it's capacity, we can't add the items(i.e, can't add the booking seats)
			if(q.size()==capacity)
			{
				try {
					// Imagine two users (user1 and user2) trying to book seats at the same time.
					// Let's say there's only one seat left (i.e., one slot in the queue).
					//
					// - user1 gets the lock first and books the last available seat (adds an item to the queue).
					// - While user1 is booking, user2 also tries to book but sees the queue is full.
					//
					// Since the queue is full, user2 must wait.
					// After user1 finishes booking and notifies other waiting threads,
					// user2 wakes up and checks again.
					//
					// But by then, the queue is still full (because no one has removed an item),
					// so user2 must go back to waiting again.
					//
					// This is why we use a **while loop** instead of an **if condition**:
					//   ➤ `while` ensures the thread re-checks the condition after being notified.
					//   ➤ `if` would check only once and might proceed incorrectly.

					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			q.add(item);
			//it will notify all the threads, that are in the wait state.
			//here, ideally it will call remove method after adding element in the Queue q
			q.notifyAll();
			return true;
			
		}
	}
	
	//Removes an item from the queue.
    //If the queue is empty, the thread will wait until an item is added.
	public int remove()
	{
		synchronized(q)
		{
			//If Queue q size is zero, we can't remove the items
			if(q.size()==0)
			{
				//In this case, this thread has to wait till any other thread is added item in the Queue q
				//Queue q object has all these method wait(), notify() and notifyAll()
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int element = q.poll();
			//it will notify all the threads, that are in the wait state.
			//here, ideally it will call add method after removing element in the Queue q
			q.notifyAll();
			return element;
		}
	}

}
