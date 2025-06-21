package in.Multithreading.ThreadLocal2;

public class CustomerThread extends Thread{

	static Integer custId = 0;

	private static ThreadLocal tl = new ThreadLocal() {

		
		protected Integer initialValue() {
			
			return ++custId ;
			
		}
	};
	
	public CustomerThread(String name) {
		
		super(name);

	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " executing with customerId : " + tl.get());
	}

}
