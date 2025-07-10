package in.Collection.WeakHashMap;

public class Temp {
	
	public String toString()
	{
		return "temp";
	}

	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}
