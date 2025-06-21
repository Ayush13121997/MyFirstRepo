package in.Multithreading.Naming;

public class MyThread extends Thread{
	
	public void run()
	{
		System.out.println( "run method executed by Thread " + Thread.currentThread().getName());
	}

}
