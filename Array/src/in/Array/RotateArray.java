package in.Array;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = {1,3,4,5,7};
		
		int k =1 ;//Number of rotation 
		
		int n = arr.length; // length of array
		
		k =k%n; // In case k is greater than n
		
		reverse(arr ,0,n-1); // {7,5,4,3,1}
		reverse(arr ,0 , k-1); // { 5,7,4,3,1}
		reverse(arr ,k ,n-1);// {5,7,1,3,4}
		
		System.out.println("Rotated Array :");
		
		for( int num : arr)
		{
			System.out.println(num);
		}
		
	}
	
	public static void reverse(int[] arr , int start , int end)
	{
		while(start< end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
			
			start++;
			end--;
		}
	}
}
