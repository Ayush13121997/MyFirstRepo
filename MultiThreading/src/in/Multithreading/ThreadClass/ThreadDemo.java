package in.Multithreading.ThreadClass;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread t = new MyThread(); // Thread Instantiation
		t.start(); // starting of a Thread
		
		//t.run();// a new thread won't be created and run method will be executed by normal method call
		
		//t.start();
		//executed by main thread
		for(int i= 0; i < 10; i++)
		{
			System.out.println("Main Thread ...");
		}

	}

}
