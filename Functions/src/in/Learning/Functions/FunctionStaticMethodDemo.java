package in.Learning.Functions;

import java.util.function.Function;

public class FunctionStaticMethodDemo {

	public static void main(String[] args) {
		
		Function<String ,String> f1 = Function.identity();
		
		String result = f1.apply("Hello World");
		
		System.out.println(result); // Output: Hello World

	}

}
