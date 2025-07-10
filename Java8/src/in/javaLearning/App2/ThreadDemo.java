package in.javaLearning.App2;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread is running: " + i);
			}
		};

		Thread t = new Thread(r);
		t.start(); // Start the thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread is running: " + i);
		}

	}
}
