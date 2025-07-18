package in.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {


		Map<String ,List<List<Integer>>> map = Map.of(
			"a", List.of(List.of(1, 2),List.of( 3)),
			"b", List.of(List.of(4, 5), List.of(6, 7))
		);
		
		List<Integer> list = map.values().stream()
			.flatMap(List::stream) // Flatten the nested lists
			.flatMap(List::stream) // Further flatten to individual integers
			.collect(Collectors.toList()) ;// Collect to a list
		
		System.out.println("Flattened list: " + list);

	}
}