package in.streams;

import java.util.List;

public class NestedListToList {

	public static void main(String[] args) {

		List<List<Integer>> nestedList = List.of(
			List.of(1, 2, 3),
			List.of(4, 5),
			List.of(6, 7, 8, 9)
		);
		
		List<Integer> flatList = nestedList.stream()
			.flatMap(List::stream) // Flatten the nested list
			.toList(); // Collect to a list
		
		System.out.println("Flattened list: " + flatList);
		
	}

}
