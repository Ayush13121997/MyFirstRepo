package in.Multithreading.ThreadPool;

public class PrintJob implements Runnable{
	
	String name ;
	
	PrintJob(String name) {
		
		this.name= name;
	}
    public void run()
    {
    	System.out.println(name + "...Job Started by : " + Thread.currentThread().getName());
         
    	try
    	{
    		Thread.sleep(5000);
    	}
    	catch (InterruptedException e) {
    		
		}
    	
    	System.out.println(name + "...Job Completed by : " + Thread.currentThread().getName());
    	
    }
    
    
}
