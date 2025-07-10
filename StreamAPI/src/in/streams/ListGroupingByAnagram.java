package in.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListGroupingByAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example list of words
		List<String> words = List.of("listen", "silent", "enlist", "inlets", "google", "gooogle");
		
		words.stream()
			.collect(Collectors.groupingBy(word -> {
				// Sort the characters of the word to create a key for anagrams
				char[] chars = word.toCharArray();
				Arrays.sort(chars);
				return new String(chars);
			}))
			.forEach((key, anagramList) -> 
				System.out.println("Anagrams for '" + key + "': " + anagramList)); // Print grouped anagrams

	}

}
