package in.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumberAndCount {

	public static void main(String[] args) {
		

		List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 1);
		
		numbers.stream()
		.collect(Collectors.groupingBy(Function.identity(), 
				Collectors.counting())) // Group by number and count occurrences
		
		.entrySet().stream() // Convert to stream of entries
		.filter(entry -> entry.getValue() > 1) // Filter for duplicates
		.forEach(entry -> 
			System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue())
		); // Print the number and its count
	}

}
