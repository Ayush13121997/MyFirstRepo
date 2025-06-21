package in.Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		
      PrintJob[] jobs = { new PrintJob("ayush") ,
    		              
    		               new PrintJob("Ravi"),
    		               
    		               new PrintJob("Shivam"),
    		               
    		               new PrintJob("Rohit"),
    		               
    		               new PrintJob("Suresh") };
      
      ExecutorService service = Executors.newFixedThreadPool(3);
      
      for(PrintJob job : jobs)
      {
    	  service.submit(job);
      }
      
      service.shutdown();
      
      }

	}
