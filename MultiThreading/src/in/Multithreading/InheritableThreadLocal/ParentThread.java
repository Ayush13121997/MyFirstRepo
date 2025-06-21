package in.Multithreading.InheritableThreadLocal;

public class ParentThread extends Thread{
	
	public static InheritableThreadLocal tl = new InheritableThreadLocal()
			{
		
		       public Object childvalue(Object p)
		       {
		    	   return "cc";
		       }
		      
			};
			
			public void run()
			{
				tl.set("pp");
				
				System.out.println("Parent Thread Value..." + tl.get());
				
				ChildThread ct = new ChildThread();
				
				ct.start();
				
			}

}
