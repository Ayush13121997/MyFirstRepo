package in.Collection.Linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Ayush");
		
		l.add(26);
		
		l.add(null);
		
		l.add("Ayush");
		
		System.out.println(l);
		
		l.set(0, "Collection");
		
		System.out.println(l);
		
		l.add(0, "Framework");
		
		l.removeLast();
		
		l.addFirst("Learning");
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		
		
		

	}

}
