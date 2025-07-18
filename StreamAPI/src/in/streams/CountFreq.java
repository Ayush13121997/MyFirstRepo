package in.streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreq {
	
	public static void main(String[] args) {
		
		String str = "hello world";
		
		// Count frequency of each character in the string using streams
		
		str.chars()
		.mapToObj(c -> (char) c)
		.filter(c -> c != ' ') // Exclude spaces
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((character, frequency) -> 
			System.out.println(character + ": " + frequency));
	}

}
