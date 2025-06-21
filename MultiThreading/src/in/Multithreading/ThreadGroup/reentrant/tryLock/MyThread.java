package in.Multithreading.ThreadGroup.reentrant.tryLock;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

	static ReentrantLock l = new ReentrantLock();
	
	public MyThread(String name) {
		
		super(name);
		
	}
	
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName() + "......got Lock and Performing safe Operations");
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + "...... unable to get Lock and performing alternatives operations");
		}
	}
	
}
