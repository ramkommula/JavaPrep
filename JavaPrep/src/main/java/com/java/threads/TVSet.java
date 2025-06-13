package com.java.threads;

public class TVSet {
	
	//we make this class as singleton to make sure that the class instance will be create one time only
	
	//Thread1 is updated the value and that value is stored in CPU Cache layer and before it reaches to Main Memory RAM
	//Thread2 is trying to access that value from it's CPU Cache layer(this has still old value)
	//To avoid this scenario will use volatile keyword to make sure the latest updated value to available.
	
	private static volatile TVSet tvSetInstance = null;
	
	private TVSet()
	{
		System.out.println("TV Set Instantiated");
	}

	public static TVSet getTvSetInstance() {
		if(tvSetInstance == null)
		{
			synchronized(TVSet.class) {
				if(tvSetInstance == null)
				{
					tvSetInstance = new TVSet();
				}
			}
		}
		return tvSetInstance;
	}
	
	

}
