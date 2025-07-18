package in.streams;

import java.util.List;

public class CommonElementsBetweenTwoStreams {

	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		
		List<Integer> list2 = List.of(4, 5, 6, 7, 8);
		
		// Find common elements between two streams
		
		List<Integer> commonElements = list1.stream()
				.filter(list2::contains)
				.toList();
		
		System.out.println("Common elements between the two streams: " + commonElements);

	}

}
