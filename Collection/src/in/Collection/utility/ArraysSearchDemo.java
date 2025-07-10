package in.Collection.utility;

import java.util.Arrays;

public class ArraysSearchDemo {

	public static void main(String[] args) {

		
		
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int key = 50;
		
		int index = Arrays.binarySearch(arr, key);
		System.out.println("Index of " + key + " in the array: " + index);
		
		int notFoundKey = 25;
		int notFoundIndex = Arrays.binarySearch(arr, notFoundKey);
		System.out.println("Index of " + notFoundKey + " in the array: " + notFoundIndex);
	}

}
