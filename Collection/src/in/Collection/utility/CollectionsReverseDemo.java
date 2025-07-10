package in.Collection.utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(0);
		list.add(20);
		list.add(10);
		list.add(5);
		System.out.println("Original list: " + list);
		// Reversing the list
		Collections.reverse(list);
		System.out.println("Reversed list: " + list);
	}

}
