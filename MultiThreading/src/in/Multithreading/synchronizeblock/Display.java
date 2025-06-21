package in.Multithreading.synchronizeblock;

public class Display {
	
	public void wish(String name)
	{
		;;;;;;;;;;;;;;;;;;;;;;;// 1 lakh lines of code
		System.out.println("welcome to the world of coding");		
		
		
	    synchronized (this) {
	    	
	    	for(int i = 0 ; i < 10 ; i++)
	    	{
	    		System.out.print("Good Morning : ");
	    		
	    		try
	    		{
	    			Thread.sleep(2000);
	    		}
	    		catch(InterruptedException e)
	    		{
	    			
	    		}
	    		
	    		System.out.println(name);
	    	}
			
		}
	    
	    
	    ;;;;;;;;;;;;;;;;;;;;;;;;;; // 1 lakh lines of code 
		
	}

}
