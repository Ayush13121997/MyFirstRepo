package in.Learning.Functions;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> f1 = (name) -> name.toUpperCase();
		
		Function<String, String> f2 = (name) -> name.substring(0, 3);
		
		Function<String, String> f3 = (name) -> name + " is a good person";
		
		// Chaining functions	
		Function<String, String> chainedFunction = f1.andThen(f2).andThen(f3);
		
		// Applying the chained function
		Function<String, String> chainedFunction2 = f1.compose(f3).compose(f2);
		
		
		String result = chainedFunction.apply("ayush");
		System.out.println(result); // Output: AYU is a good person
		
		
		String result2 = chainedFunction2.apply("ayush");
		System.out.println(result2); // Output: AYUSH is a good person

	}

}
