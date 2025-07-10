package in.Collection.utility;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {


		int[] arr = { 5, 2, 8, 1, 3 };
		System.out.println("Primitive Array before Sorting: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	
		Arrays.sort(arr);
		System.out.println("\nPrimitive Array after Sorting: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		String[] strArr = { "Banana", "Apple", "Cherry", "Date" };
		
		System.out.println("\n\nString Array before Sorting: ");
		
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		
		Arrays.sort(strArr);
		
		System.out.println("\nString Array after Sorting: ");
		
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		Arrays.sort(strArr, new MyComparator());
		System.out.println("\nString Array after Sorting with Comparator: ");
		for (String str : strArr) {
			System.out.print(str + " ");
		}
	
	}

}
