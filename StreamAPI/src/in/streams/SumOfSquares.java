package in.streams;

import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {


		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		int sumOfSquares = numbers.stream()
			.mapToInt(n -> n * n) // Square each number
			.sum(); // Sum the squares
		
		System.out.println("Sum of squares: " + sumOfSquares);
		
		
		
		List<Integer> numbers2 = List.of(1, 2, 3, 4, 5);
		
		int sumOfSquares2 = numbers2.stream()
			.map(n -> n * n) // Square each number
			.reduce(0, Integer::sum); // Sum the squares using reduce
		
		System.out.println("Sum of squares using reduce: " + sumOfSquares2);
	}

}
