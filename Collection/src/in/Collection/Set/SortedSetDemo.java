package in.Collection.Set;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet l = new TreeSet();
		
		l.add(10);
		
		l.add(20);
		
		l.add(30);
		
		l.add(40);
		
		l.add(50);
		
		l.add(60);
		
		l.add(70);
		
		
		System.out.println(l.first());
		
		
		System.out.println(l.last());
		
		
		System.out.println(l.headSet(50));
		
		
		System.out.println(l.tailSet(50));
		
		
		System.out.println(l.subSet(10, 40));
		
		System.out.println(l.comparator());
		
		
		

	}

}
