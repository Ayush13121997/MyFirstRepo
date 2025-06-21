package in.Multithreading.interrupt;

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		//t.interrupt();
		System.out.println("End of Main Thread");

	}

}
