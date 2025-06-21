package in.Array;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = {1,10 ,3,4,4,5,7,1,10};
		
		int first = Integer.MIN_VALUE;
		
		int second = Integer.MIN_VALUE;
		
		for(int num : arr)
		{
			if(num > first)
			{
				second = first ;
				
				first = num ;
				
			}
			else if(num > second && num != first )
			{
				second = num;
			}
		}
		
		System.out.println("The Second Largest Element is  :" + second);
	}

}
