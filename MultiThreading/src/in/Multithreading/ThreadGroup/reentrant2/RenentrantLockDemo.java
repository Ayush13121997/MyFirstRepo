package in.Multithreading.ThreadGroup.reentrant2;

public class RenentrantLockDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 =new MyThread(d, "Dhoni");
		
		MyThread t2 = new MyThread(d, "Yuvraj");
		
		MyThread t3 = new MyThread(d, "Raina");
		
		t1.start();
		
		t2.start();
		
		t3.start();

	}

}
