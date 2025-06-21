package in.Multithreading.Naming;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread t = new MyThread();
		t.start();
		
		Thread.currentThread().setName("ayush");
		
		System.out.println("Main Method executed by thread" + " " + Thread.currentThread().getName());

	}

}
