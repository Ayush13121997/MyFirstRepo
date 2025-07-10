package in.streams;

import java.util.Comparator;
import java.util.List;

public class SortingListofStrings {

	public static void main(String[] args) {

		List<String> fruits = List.of("Banana", "Apple", "Cherry", "Date");
		
		System.out.println("Original list:");
		
		fruits.stream()
			.forEach(System.out::println); // Print original list
		
		System.out.println("\nSorted list:");
		
		fruits.stream()
			.sorted() // Sort the list in natural order
			.forEach(System.out::println); // Print sorted list
		
		System.out.println("\nSorted list in reverse order:");
		fruits.stream()
			//.sorted((a, b) -> b.compareTo(a)) // Sort the list in reverse order
		     .sorted(Comparator.reverseOrder()) // Sort the list in reverse order using Comparator
			.forEach(System.out::println); // Print sorted list in reverse order
		System.out.println("\nSorted list by length:");
		
		fruits.stream()
			.sorted((a, b) -> Integer.compare(a.length(), b.length())) // Sort by length of strings
			.forEach(System.out::println); // Print sorted list by length
		
		System.out.println("\nSorted list by length in reverse order:");
		
		fruits.stream()
			.sorted((a, b) -> Integer.compare(b.length(), a.length())) // Sort by length of strings in reverse order
			.forEach(System.out::println); // Print sorted list by length in reverse order
		
		System.out.println("\nSorted list by length and then alphabetically:");
		
		fruits.stream()
			.sorted((a, b) -> {
				int lengthComparison = Integer.compare(a.length(), b.length());
				if (lengthComparison != 0) {
					return lengthComparison; // Sort by length first
				} else {
					return a.compareTo(b); // Then sort alphabetically
				}
			})
			.forEach(System.out::println); // Print sorted list by length and then alphabetically
		
		System.out.println("\nSorted list by length and then alphabetically in reverse order:");
		
		fruits.stream()
			.sorted((a, b) -> {
				int lengthComparison = Integer.compare(b.length(), a.length());
				if (lengthComparison != 0) {
					return lengthComparison; // Sort by length first in reverse order
				} else {
					return b.compareTo(a); // Then sort alphabetically in reverse order
				}
			})
			.forEach(System.out::println); // Print sorted list by length and then alphabetically in reverse order
		
		
		
	}

}
