package in.Collection.utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Z");
		list.add("A");
		list.add("M");
		list.add("K");
		list.add("a");
		
		System.out.println("Original list: " + list);
		
		// Sorting the list
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
		
		// Searching for an element
		System.out.println(Collections.binarySearch(list, "K"));
		
		// Searching for an element that does not exist
		System.out.println(Collections.binarySearch(list, "X")); // Returns -6, indicating the position where it would be inserted
		
		

	}

}
