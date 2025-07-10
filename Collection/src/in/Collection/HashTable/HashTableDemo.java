package in.Collection.HashTable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {


		Hashtable h = new Hashtable();
		
		h.put(new Temp(5), "A");
		
		h.put(new Temp(2), "B");
		
		h.put(new Temp(16), "F");
		
		h.put(new Temp(6), "D");
		
		h.put(new Temp(23), "E");
		
		h.put(new Temp(16), "F");
		
		h.keySet().forEach(System.out::println);
		
		//h.put("ayush", null);
		
		System.out.println(h);
	}

}
