package in.Multithreading.synchronizeblock;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d =  new Display();
		
		MyThread t1 = new MyThread(d, "ayush");
		
		MyThread t2 = new MyThread(d, "Prince");
		
		
		t1.start();

		t2.start();
		
		
	}

}
