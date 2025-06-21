package in.Multithreading.ThreadGroup.methods2;

public class ThreadGroupDemo {

	public static void main(String[] args) throws Exception {
		
		ThreadGroup pg = new ThreadGroup("Parent Group");
		
		ThreadGroup cg = new ThreadGroup("Child Group");
		
		MyThread t1 = new MyThread(pg, "Child Thread 1");
		
		MyThread t2 = new MyThread(pg, "Child Thread 2");
		
		t1.start();
		
		t2.start();
		
		System.out.println(pg.activeCount());//2
		
		System.out.println(pg.activeGroupCount());//0
		
		pg.list();
		
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());//0
		
		System.out.println(pg.activeGroupCount());//0	

	}

}
