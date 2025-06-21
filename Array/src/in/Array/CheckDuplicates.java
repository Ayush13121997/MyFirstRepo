package in.Array;

import java.util.HashSet;

public class CheckDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20 ,30,40,50,20} ;
		
		HashSet<Integer> set = new HashSet<>();
		
		boolean hasDuplicates = false ;
		
		for(int num : arr)
		{
			if(!set.add(num))
			{
				hasDuplicates = true ;
				break ;
			}
			
		}
		
		System.out.println(set);
		System.out.println("Array has Dupicates : " + hasDuplicates);
	
	}

}
