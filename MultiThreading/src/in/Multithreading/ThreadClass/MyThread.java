package in.Multithreading.ThreadClass;

//Defining a Thread
public class MyThread extends Thread{
	
	/*
	public void start()
	{
	    super.start();
		System.out.println("start-method ...");
	}
 */ 
	
	public void run()
	{
		//Job of a Thread
		for(int i = 0 ;i < 10 ;i++ )
		{
			System.out.println("Child Thread ....");
		}
	}
	
	public void run(int k)
	{
		//Job of a Thread
		for(int j = 0 ;j < 10 ;j++ )
		{
			System.out.println("Overloaded Method ....");
		}
	}
	

}
