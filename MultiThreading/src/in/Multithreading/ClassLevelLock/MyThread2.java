package in.Multithreading.ClassLevelLock;

public class MyThread2 extends Thread{
	
	Display d;
	
	public MyThread2(Display d) {
		
		this.d = d ;
	}
	
	public void run()
	{
		d.displayc();
	}
	
	

}
