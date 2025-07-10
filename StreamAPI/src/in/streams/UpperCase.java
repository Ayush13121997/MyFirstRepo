package in.streams;

import java.util.List;

public class UpperCase {

	public static void main(String[] args) {

		List<String> names = List.of("Alice", "Bob", "Charlie", "David");
		
		System.out.println("Names in uppercase:");
		
		names.stream()
			.map(String::toUpperCase) // Convert each name to uppercase
			.forEach(System.out::println); // Print each name
	}

}
