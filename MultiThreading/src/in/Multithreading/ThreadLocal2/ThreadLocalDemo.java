package in.Multithreading.ThreadLocal2;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		CustomerThread c1 = new CustomerThread("CustomerThread1");
		
		CustomerThread c2 = new CustomerThread("CustomerThread2");
		
		CustomerThread c3 = new CustomerThread("CustomerThread3");
		
		CustomerThread c4 = new CustomerThread("CustomerThread4");
		
		c1.start();
		
		c2.start();
		
		c3.start();
		
		c4.start();
		
	}

}
