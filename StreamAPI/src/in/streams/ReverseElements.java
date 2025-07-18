package in.streams;

import java.util.List;
import java.util.stream.IntStream;

public class ReverseElements {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1, 2, 3, 4, 5);

		List<Integer> reversed = IntStream.range(0,list.size())
				.mapToObj(i -> list.get(list.size() - 1 - i))
				.toList();
		
		System.out.println("Original list: " + list);
		
		System.out.println("Reversed list: " + reversed);
		
	}

}
