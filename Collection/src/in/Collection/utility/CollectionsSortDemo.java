package in.Collection.utility;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
	
	public static void main(String[] args) {
		

		ArrayList list = new ArrayList();
		
		list.add("Z");
		list.add("A");
		list.add("K");	
		list.add("N");
		//list.add(new Integer(10)); //ClassCastException: cannot be cast to java.lang.Comparable
		//list.add(null); //null is allowed, but will be placed at the end of the list when sorted
		
		System.out.println("Original list: " + list);
		
//		Collections.sort(list);
		
		Collections.sort(list, new MyComparator());
		System.out.println("Sorted list: " + list);
		
		
	}

}
