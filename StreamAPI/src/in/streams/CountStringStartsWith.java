package in.streams;

import java.util.List;

public class CountStringStartsWith {

	public static void main(String[] args) {


		List<String> words = List.of("apple", "banana", "apricot", "grape", "avocado", "kiwi");
		
		long count = words.stream()
			.filter(word -> word.startsWith("a")) // Filter words that start with 'a'
			.count(); // Count the filtered words
		
		System.out.println("Number of words starting with 'a': " + count); // Print the count
	}

}
