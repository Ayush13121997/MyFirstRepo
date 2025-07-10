package in.Collection.utility;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String[] args) {

		String[] arr = { "A", "B", "C", "D", "E" };
		
		// Converting array to list
		List<String> list = Arrays.asList(arr);
		
		System.out.println("List created from array: " + list);
		
		// Modifying the list
		
		list.set(0, "Z");
		System.out.println("Modified list: " + list);
		// Note: The original array is also modified because the list is backed by the array
		System.out.println("Original array after modification: " + Arrays.toString(arr));
		// Uncommenting the next line will throw UnsupportedOperationException
		// list.add("F"); // This will throw UnsupportedOperationException because the list is fixed-size
		// list.remove(0); // This will also throw UnsupportedOperationException
		// However, we can modify existing elements
		list.set(1, "Y");
		System.out.println("List after modifying second element: " + list);
		// Converting the list back to an array
		String[] newArr = list.toArray(new String[0]);
		System.out.println("Array created from list: " + Arrays.toString(newArr));
		// Note: The original array is still modified, but the new array is a separate copy
		System.out.println("Original array after all modifications: " + Arrays.toString(arr));
		// Demonstrating that the list is fixed-size
		try {
			list.add("F"); // This will throw UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println("Cannot add elements to the list created from an array: " + e.getMessage());
		}
	}

}
