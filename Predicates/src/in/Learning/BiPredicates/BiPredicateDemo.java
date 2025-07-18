package in.Learning.BiPredicates;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
		
		// BiPredicate to check if two strings are equal
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		
		System.out.println(biPredicate.test("Hello", "Hello")); // true
		System.out.println(biPredicate.test("Hello", "World")); // false
		
		// BiPredicate to check if a number is greater than another number
		BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
		
		System.out.println(isGreater.test(10, 5)); // true
		System.out.println(isGreater.test(3, 7)); // false
		
	}

}
