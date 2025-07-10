package in.javaLearning.App1;

public class Demo implements Interf {

	@Override
	public void m1() {
		System.out.println("Method m1 implemented in Demo class");
	}

	public static void main(String[] args) {

		Interf i = new Demo();
		i.m1(); // Calls the method m1 implemented in Demo class

	}
}
