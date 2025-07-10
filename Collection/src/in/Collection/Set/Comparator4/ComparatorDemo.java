package in.Collection.Set.Comparator4;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Nag", 100);

		Employee e2 = new Employee("Bala", 200);

		Employee e3 = new Employee("Chiru", 300);

		Employee e4 = new Employee("Venki", 400);

		Employee e5 = new Employee("Nag", 100);

		TreeSet t = new TreeSet();

		t.add(e5);

		t.add(e4);

		t.add(e3);

		t.add(e2);

		t.add(e1);

		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator());

		t1.add(e5);

		t1.add(e4);

		t1.add(e3);

		t1.add(e2);

		t1.add(e1);

		System.out.println(t1);
		
		

	}

}
