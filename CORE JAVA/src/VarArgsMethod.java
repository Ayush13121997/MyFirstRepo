
public class VarArgsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Sum();
	  Sum(10,20);
	  Sum(10,20,30);
	   
	  int[] a = {10,20,30};
	  int[] b = {40,50,60};
	  m5(a,b);

	}
    public static void Sum(int... x)
    //internally var-args method converted into 1D array.Hence within var-args method we can differentiate values using index
    {
    	int total = 0;
    	for(int x1 : x)
    	{
    		total =total + x1;
    	}
    	System.out.println(total);
    }
    
    public static void m1(int x ,int... y)
    {
    	
    }
    /*
     * if we mix normal parameter with var-args parameter then var-args parameter should be the last parameter
     * 
    public void m2(int... x , int y)
    {
    	
    }
    */
    
    
    /*
     * inside var-args method we can take only one var-args parameter
     * 
    public static void m3(int... x ,int... y)
    {
    	
    }
    */
    
    /*
     * inside var args method we can't declare vararg method and corresponding 1-d array method simultaneously otherwise we will get compile time error 
     * 
       public static void Sum(int[] x)
       {
    	
       }
     * 
     */
    
    //In General Var-args method will get least priority i.e. if no other mehod matches then only var-args method get chance
    
    
    public static void m5(int[]... x)
    {
    	for(int[] x1 : x)
    	{
    		System.out.println(x[0]);
    	}
    }
    
    
    
    
}
