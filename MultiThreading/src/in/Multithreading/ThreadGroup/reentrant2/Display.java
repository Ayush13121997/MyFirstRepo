package in.Multithreading.ThreadGroup.reentrant2;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
	ReentrantLock l = new ReentrantLock();
	
	public void doWish(String name)
	{
		
		l.lock();
		
		for(int i = 0 ; i <=10 ; i++)
		{
			System.out.print("Good Morning :");
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {	}
			
			System.out.println(name);
		}
		
		l.unlock();
	}

}
