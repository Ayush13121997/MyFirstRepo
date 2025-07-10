package in.streams;

import java.util.List;
import java.util.stream.Collectors;

public class SumPair {

	public static void main(String[] args) {

		List<Integer> nums = List.of(1, 2, 3, 7, 5, 8, 6, 4);
		int targetSum = 10;

		System.out.println("Pairs with sum " + targetSum + ":");

		List<List<Integer>> collect = nums.stream()
			.flatMap(i -> nums.stream()
							.filter(j -> i + j == targetSum && i < j) 
							.distinct()// Ensure  unique pairs
				.map(j -> List.of(i, j))) // Create a list for each pair
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
