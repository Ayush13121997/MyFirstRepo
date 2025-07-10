package in.Innerclasses.Demo2;

public class Outer {
	
	class Inner{
		
		public void m1()
		{
			System.out.println("Inner Class method");
		}
	}
	
	public void m2()
	{
		Inner i = new Inner();
		
		i.m1();
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Outer Class main method");
		
		Outer o = new Outer();
		
		o.m2();
		
		
		
	}
	
	

}
