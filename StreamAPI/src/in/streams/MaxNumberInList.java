package in.streams;

import java.util.List;

public class MaxNumberInList {

	public static void main(String[] args) {
		

		List<Integer> numbers = List.of(5,19,111,10,19,24,43);
		
		int maxNumber = numbers.stream()
			.max(Integer::compareTo) // Find the maximum number
			.orElseThrow(() -> new RuntimeException("List is empty")); // Handle empty list case
			
		
		System.out.println("Maximum number in the list: " + maxNumber);
	}

}
