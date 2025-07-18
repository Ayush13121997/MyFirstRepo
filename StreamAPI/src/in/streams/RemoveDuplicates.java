package in.streams;

import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		// Example array with duplicates
		List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
		
		// Remove duplicates using streams
		 List<Integer> uniqueNumbers = numbers.stream()
				.distinct()
				.toList();
		
		System.out.println("List after removing duplicates: " + uniqueNumbers);
		
		
	}

}
