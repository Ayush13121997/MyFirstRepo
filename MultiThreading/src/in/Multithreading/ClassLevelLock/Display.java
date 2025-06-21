package in.Multithreading.ClassLevelLock;

public class Display {
	
	public static synchronized void displayn()
	{
		for(int i =0 ; i< 10 ; i++ )
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
				
			}
			catch (InterruptedException e) {
				
			}
		}
	}
	
	public static synchronized void displayc()
	{
		for(int i = 55  ; i < 75 ; i++ )
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(2000);
				
			}
			catch (InterruptedException e) {
				
			}
		}
	}

}
