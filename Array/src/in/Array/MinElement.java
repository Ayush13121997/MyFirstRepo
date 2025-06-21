package in.Array;

public class MinElement {

	public static void main(String[] args) {

		int[] arr = {10,20 ,30,40,50} ;
		
		int min = arr[0];
		
		for(int num : arr)
		{
			if(min > num)
			{
				min = num ;
			}
		}
		
		System.out.println("Minimum Element :" + min);
	}

}
