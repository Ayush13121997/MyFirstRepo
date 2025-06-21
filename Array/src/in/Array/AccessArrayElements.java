package in.Array;

public class AccessArrayElements {
	
    public static void main(String[] args) {
    	
        int[] arr = {10, 20, 30, 40, 50};
        
        System.out.println("Element at index 2: " + arr[2]);
        
        System.out.println(arr);//[I@2b2fa4f7 ---> class name @hashcode in hexadecimal form


      //System.out.println(arr[5]);  
      //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        
    }
}