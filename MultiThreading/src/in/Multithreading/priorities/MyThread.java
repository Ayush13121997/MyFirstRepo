package in.Multithreading.priorities;

public class MyThread extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread ...");
			
			System.out.println("child Thread Priority :  " +Thread.currentThread().getPriority());
		}
	}
}
