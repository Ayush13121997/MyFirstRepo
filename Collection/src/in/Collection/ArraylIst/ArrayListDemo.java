package in.Collection.ArraylIst;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		
		l.add("A");
		
		l.add(10);
		
		l.add("A");
		
		l.add(null);
		
		System.out.println(l);
		
		//l.remove(2);
		
		System.out.println(l);
		
		l.add(2,"M");
		
		l.add("N");
		
		System.out.println(l);
		
		System.out.println(l.indexOf("A"));
		
		System.out.println(l.lastIndexOf("A"));
		
		System.out.println(l.get(2));
		
		l.set(1, "A");
		
		System.out.println(l);
		
		
		ArrayList al = new ArrayList();
		
		al.addAll(l);
		
		al.add("Z");
		
		System.out.println(al);
		
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.size());
		
		l.clear();
		
		System.out.println(l);
		
		
	}

}
