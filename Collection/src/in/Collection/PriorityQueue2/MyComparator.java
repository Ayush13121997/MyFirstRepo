package in.Collection.PriorityQueue2;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		if (o1 instanceof String && o2 instanceof String) {
			String str1 = (String) o1;
			String str2 = (String) o2;
			return str2.compareTo(str1);
		}
		return 0; // Default case if not strings
	}
	

}
