package in.streams;

import java.util.List;

public class CountEachWord {

	public static void main(String[] args) {

   
		List<String> sentences = List.of("Java is Fun" , "Streams are Powerful" , "Java is Powerful" );
		
		sentences.stream()
			.flatMap(sentence -> List.of(sentence.split(" ")).stream()) // Split each sentence into words and flatten the stream
			.distinct() // Remove duplicate words
			.forEach(word -> {
				long count = sentences.stream()
					.flatMap(sentence -> List.of(sentence.split(" ")).stream()) // Split again to count occurrences
					.filter(w -> w.equalsIgnoreCase(word)) // Filter for the current word
					.count(); // Count occurrences of the word
				System.out.println(word + ": " + count); // Print the word and its count
			});
	}

}
