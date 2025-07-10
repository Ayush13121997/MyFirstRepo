package in.streams;

import java.util.List;
import java.util.stream.Collectors;

public class GroupWordBylength {

	public static void main(String[] args) {

		List<String> words = List.of("apple", "banana", "kiwi", "grape", "orange", "pear");
		
		System.out.println("Grouping words by length:");
		
		words.stream()
		.collect(Collectors.groupingBy(String::length)) // Group words by their length
		.forEach((length, wordList) -> 
			System.out.println("Length " + length + ": " + wordList)); // Print the grouped words
	}

}
