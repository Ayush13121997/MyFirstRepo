package in.Multithreading.priorities;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Start Priority" + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(7);
		
		MyThread t = new MyThread();
		t.setPriority(9);
		t.start();
		
		System.out.println(t.getPriority());
		
		for(int i = 0 ;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}
