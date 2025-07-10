package in.streams;

import java.util.Arrays;

public class EvenOdd {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println("Even numbers:");
		Arrays.stream(numbers)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);

		System.out.println("Odd numbers:");
		Arrays.stream(numbers)
			.filter(n -> n % 2 != 0)
			.forEach(System.out::println);
	}

}
