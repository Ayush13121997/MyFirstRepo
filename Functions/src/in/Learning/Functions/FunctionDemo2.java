package in.Learning.Functions;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		Function<String,Integer> f = s1->s1.length() - s1.replaceAll(" ","").length();
		
		System.out.println(f.apply(s));

	}

}
