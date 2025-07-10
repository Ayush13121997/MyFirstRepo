package in.Collection.Set;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);

		System.out.println("Original TreeSet: " + ts);
		
		System.out.println("Using Ceiling: " + ts.ceiling(20));
		
		System.out.println("Using Higher: " + ts.higher(20));
		
		System.out.println("Using Floor: " + ts.floor(30));
		
		System.out.println("Using Lower: " + ts.lower(30));
		
		System.out.println("Using Poll First: " + ts.pollFirst());
		
		System.out.println("TreeSet after Poll First: " + ts);
		
		System.out.println("Using Poll Last: " + ts.pollLast());
		
		System.out.println("TreeSet after Poll Last: " + ts);
		
		System.out.println("Using Descending Set: " + ts.descendingSet());
		
		System.out.println("Using First: " + ts.first());
		System.out.println("Using Last: " + ts.last());
		
		System.out.println("Using SubSet (20, 40): " + ts.subSet(20, 40));
		
		System.out.println("Using HeadSet (30): " + ts.headSet(30));
		
		System.out.println("Using TailSet (30): " + ts.tailSet(30));
		System.out.println("Using Comparator: " + ts.comparator());
		System.out.println("Using Size: " + ts.size());
		System.out.println("Using Is Empty: " + ts.isEmpty());
		System.out.println("Using Clear: ");
		ts.clear();
		System.out.println("TreeSet after Clear: " + ts);
		
		System.out.println("Using Is Empty after Clear: " + ts.isEmpty());
		
	}

}
