package in.Collection.Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		
		h.add("A");
		
		h.add("Y");
		
		h.add("U");
		
		h.add("S");
		
		h.add("H");
	
		h.add(null);
		
		h.add(10);
		
		System.out.println(h.add("A"));
		
		System.out.println(h);
	
	
	}

}
