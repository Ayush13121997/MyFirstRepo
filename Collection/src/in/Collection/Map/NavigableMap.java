package in.Collection.Map;

import java.util.TreeMap;

public class NavigableMap {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();

		map.put("b", "banana");
		map.put("c", "cherry");
		map.put("a", "apple");
		map.put("d", "date");
		map.put("g", "grape");

		System.out.println("Original map: " + map);

		System.out.println(map.ceilingKey("c"));

		System.out.println(map.floorKey("c"));

		System.out.println(map.higherKey("c"));

		System.out.println(map.lowerKey("c"));

		System.out.println(map.firstKey());

		System.out.println(map.lastKey());

		System.out.println(map.pollFirstEntry());

		System.out.println(map.pollLastEntry());

		System.out.println("Map after polling first and last entries: " + map);

		System.out.println(map.descendingMap());

		System.out.println(map.headMap("c", true));

		System.out.println(map.tailMap("c", true));

		System.out.println(map.subMap("b", true, "d", true));

		System.out.println("Map after subMap: " + map);

		System.out.println(map.navigableKeySet());
	}

}
