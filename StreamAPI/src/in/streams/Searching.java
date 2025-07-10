package in.streams;

import java.util.List;

public class Searching {

	public static void main(String[] args) {

		
		List<String> names = List.of("Alice", "Bob", "Charlie", "David");
		
		System.out.println("Searching for names starting with 'C':");
		
		names.stream()
		.filter(name -> name.startsWith("C")) // Filter names starting with 'C'
			.findFirst() // Find the first matching name
			.ifPresentOrElse(
				name -> System.out.println("Found: " + name), // If found, print it
				() -> System.out.println("No name found starting with 'C'") // If not found, print a message
			);
	}

}
