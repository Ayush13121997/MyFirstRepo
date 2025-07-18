package in.Learning.Predicates;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {

		String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };
		
		Predicate<String> startsWithA = name -> name.startsWith("A");
		
		for (String name : names) {
			if (startsWithA.test(name)) {
				System.out.println(name + " starts with A");
			} else {
				System.out.println(name + " does not start with A");
			}
		}
	}

}
