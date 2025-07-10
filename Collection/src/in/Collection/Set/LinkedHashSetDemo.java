package in.Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();

		h.add("A");

		h.add("Y");

		h.add("U");

		h.add("S");

		h.add("H");

		h.add(null);

		h.add(10);

		System.out.println(h.add("A"));
		
		h.add(null);

		System.out.println(h);
	}

}
