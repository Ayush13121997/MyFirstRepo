package in.javaLearning.App1;

public class DemoWithLambda {

	public static void main(String[] args) {

		Interf i = () -> System.out.println("Method m1 implemented using Lambda expression");
		i.m1(); // Calls the method m1 implemented using Lambda expression
	}

	
	
}
