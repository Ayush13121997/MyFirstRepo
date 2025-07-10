package in.Collection.Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();

		l.add("Hrthik");

		l.add("Salman");

		l.add("Ranbir");

		l.add("Aamir");

		System.out.println(l);

		ListIterator<String> ltr = l.listIterator();

		while (ltr.hasNext()) {
			String s = ltr.next();

			if (s.equals("Salman")) {
				ltr.remove();
			} else if (s.equals("Aamir")) {
				ltr.add("Zunaid");
			} else if (s.equals("Ranbir")) {
				ltr.set("Alia");
			}
		}

		System.out.println(l);

	}

}
