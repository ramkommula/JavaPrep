package com.java.threads;

class SharedObject {
	public volatile boolean flag = false;
	
	public void setFlag(boolean flag)
	{
		this.flag = flag;
	}
	public boolean getFlag()
	{
		return flag;
	}
}
public class VolatileKeyword {
	
	public static void main(String[] args) {
		
		//In reality Threads works with shared objects, there few issues will come
		SharedObject sharedResource = new SharedObject();
		
		//Thread 1
		new Thread(() -> {
			System.out.println("Thread 1 is Started");
			System.out.println(sharedResource.hashCode());
			try {
				Thread.sleep(2000);
				sharedResource.setFlag(true);
				System.out.println("Flag set by Thread 1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1 is Completed");
		}).start();
		
		//Thread 2
		new Thread (() -> {
			System.out.println("Thread 2 is Started");
			System.out.println(sharedResource.hashCode());
			
			//This Infinite while loop will keep on running until this flag is set to True.
			//but this loop will not get the Flag as true even though flag is set to True 
			//To solve this visibility problem, we need to use volatile keyword in boolean variable
			//instead volatile, we can use synchronized keyword also in getter and setter methods
			while(!sharedResource.getFlag())
			{
				//It will run until flag value is true
			}
			System.out.println("Thread 2 is completed");
			
		}).start();
	}

}
