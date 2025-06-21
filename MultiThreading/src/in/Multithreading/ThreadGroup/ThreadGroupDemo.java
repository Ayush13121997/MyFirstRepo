//Program to display all active thread names belongs to System group And its Child group

package in.Multithreading.ThreadGroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		ThreadGroup sys = Thread.currentThread().getThreadGroup().getParent();
		
		Thread []t = new Thread[sys.activeCount()];
		
		
		sys.enumerate(t);
		
		for(Thread t1 : t)
		{
			System.out.println(t1.getName() + "....." + t1.isDaemon());
		}

	}

}
