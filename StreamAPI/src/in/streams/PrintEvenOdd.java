package in.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<String> list = numbers.stream()
			.map(n -> n % 2 == 0 ? "Even " : "Odd ") // Map to "Even" or "Odd"
			.collect(Collectors.toList()) ;// Collect to a list
		
		System.out.println(list);
		
		

	}

}
