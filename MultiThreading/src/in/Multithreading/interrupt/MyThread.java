package in.Multithreading.interrupt;

public class MyThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am Lazy Thread");

				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {

			System.out.println("I got Interrupted");

		}
	}

}
