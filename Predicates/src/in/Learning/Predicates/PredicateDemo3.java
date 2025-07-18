package in.Learning.Predicates;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {

		Person[] people = {
			new Person("Alice", 30),
			new Person("Bob", 25),
			new Person("Charlie", 35),
			new Person("David", 20),
			new Person("Eve", 28)
		};
		
		Predicate<Person> isAdult = person -> person.age >= 18;
		
		for (Person person : people) {
			if (isAdult.test(person)) {
				System.out.println(person.name + " is an adult.");
			} else {
				System.out.println(person.name + " is not an adult.");
			}
		}

}
}
