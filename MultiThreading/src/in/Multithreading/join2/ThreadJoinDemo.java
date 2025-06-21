package in.Multithreading.join2;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException{
		
		// Store the current thread in the static variable mt in the MyThread class
		MyThread.mt =Thread.currentThread();
		
		MyThread t = new MyThread();
		t.start();
		//t.join(); // Note :- if we uncomment this line then it will be a deadlock situation
		
		for(int i =0 ;i <10 ;i++)
		{
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
		
	}

}
