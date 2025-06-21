package in.Array;

public class ArrayIntialization {

	public static void main(String[] args) {

		// To Specify Array size , the allowed datatypes are byte , short , char , int
		// the maximum allowed array size in java 2147483647 which is maximum value of int datatype
		// once we create an array every element by default initialize with default values . if we are not satisfied with it we can override .
		
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int num : arr) {
			System.out.print(num + " "); // 1 2 3 4 5
		}

	}

}
