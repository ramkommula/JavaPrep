package com.java.threads;

public class ThreadStates {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(1); //Puts the thread to sleep for 1 millisecond.
				for(int i=1000; i>0; i--); //A no-operation loop that runs from 1000 to 1 just to burn some CPU time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}, "States"); //The thread is named "States"
		
		thread.start(); //Starts the thread. This transitions the thread from NEW → RUNNABLE.
		
		while(true)
		{
			Thread.State state = thread.getState();
			System.out.println(state); //Continuously checks and prints the state of the thread using thread.getState().
			if(state == Thread.State.TERMINATED) break;
		}
		
		//System.out.println(state); --> This will prints below thread states in different stages.
		//thread.start();  thread goes from NEW → RUNNABLE              ---> RUNNABLE
		//Thread.sleep(1) causes a short TIMED_WAITING state.			---> TIMED_WAITING
		//The loop afterward causes it to be RUNNABLE.					---> RUNNABLE
		//Once the thread completes both steps, it moves to TERMINATED.	---> TERMINATED
	}

}
