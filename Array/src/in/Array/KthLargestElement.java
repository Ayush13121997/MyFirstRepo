package in.Array;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 5, 6, 4 };

		int k = 2; // Find the 2nd largest element

		Arrays.sort(arr);

		System.out.println(k + "th largest element: " + arr[arr.length - k]);
	}
}
