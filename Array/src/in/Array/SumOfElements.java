package in.Array;

public class SumOfElements {

	public static void main(String[] args) {
		

		sum(new int[] {10,15,20,25,30,35}); //Anonymous arrays concept

	}

	public static void sum(int[] x)
	{
		int sum = 0 ;
		
		for(int x1 : x)
		{
			sum += x1 ;
		}
		System.out.println("The sum :" + sum);
	}
}
