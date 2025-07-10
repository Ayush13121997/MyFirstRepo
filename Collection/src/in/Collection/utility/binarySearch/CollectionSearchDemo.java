package in.Collection.utility.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {

	public static void main(String[] args) {


		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(15);
		list.add(0);
		list.add(20);
		list.add(10);
		list.add(5);
		System.out.println("Original list: " + list);
		
		Collections.sort(list,new MyComparator());
		
		System.out.println("Sorted list: " + list);
		// Searching for an element
		System.out.println(Collections.binarySearch(list, 10 , new MyComparator())); // Returns the index of the element
		
		// Searching for an element that does not exist
		System.out.println(Collections.binarySearch(list, 25, new MyComparator())); // Returns -6, indicating the position where it would be inserted
		
		System.out.println(Collections.binarySearch(list, 17));
	}

}
