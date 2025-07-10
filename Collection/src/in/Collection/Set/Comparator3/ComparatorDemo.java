package in.Collection.Set.Comparator3;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t = new TreeSet(new MyComparator());
		
		t.add(new StringBuffer("ABC"));
		
		t.add(new StringBuffer("AA"));
		
		t.add("XX");
		
		t.add("ABCD");
		
		t.add("A");
		
		System.out.println(t);
	}

}
