package in.Array;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5};
		
        int[] arr2 = {2, 4, 6};
        
        int[] merged = new int[arr1.length + arr2.length];
        
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        } 
        
        while(i < arr1.length)
        {
        	merged[k++] = arr1[i++];
        }
        
        while(j < arr2.length)
        {
        	merged[k++] = arr2[j++];
        }
        
        System.out.println("Merged Array :");
        for(int mergeElement : merged)
        {
        	System.out.println(mergeElement);
        }
	}

}
