package in.Collection.Set.Comparator2;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("Ayush");
		
		t.add("Shivam");
		
		t.add("Rohit");
		
		t.add("Kartik");
		
		System.out.println(t);
		
		
		
	}

}
