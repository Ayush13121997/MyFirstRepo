package in.Learning.Predicates;

import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = I -> I > 10;
		
		System.out.println(p.test(5));  // Output: false
		
		System.out.println(p.test(15)); // Output: true
		
		Predicate<String> p1 = s -> s.length() > 5;
		
		System.out.println(p1.test("Hello")); // Output: false
		
		System.out.println(p1.test("Hello World")); // Output: true
		
		Predicate<Collection> p2 = c -> c.isEmpty();

	}

}
