package in.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		
		// Find the most frequent element in the list using streams
		String mostFrequent = list.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.orElse(null);
		
		System.out.println("Most frequent element: " + mostFrequent);

	}

}
