package in.Multithreading.ThreadGroup.reentrant.tryLock2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
	
	static ReentrantLock l = new ReentrantLock();
	
	public MyThread(String name) {
		
		super(name);
	}

	public void run()
	{
		do {
			
			try
			{
			
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName() + "...got Lock");
					
					Thread.sleep(30000);
					
					l.unlock();
					
					System.out.println(Thread.currentThread().getName() + "...releases Lock");
					
					break;
					
				}
				else
				{
					System.out.println(Thread.currentThread().getName() + "...unable to get Lock and try again");
				}
				
			}catch (Exception e) {
				
			}
			
		} 
		while(true);
	}
}
