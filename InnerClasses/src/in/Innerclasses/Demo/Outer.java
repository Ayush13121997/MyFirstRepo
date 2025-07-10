package in.Innerclasses.Demo;

public class Outer {
	
	class Inner{
		
		public void m1()
		{
			System.out.println("Inner Class method");
		}
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Outer Class main method");
		/*
		Outer o = new Outer();
		
		Outer.Inner i = o.new Inner();
		
		i.m1();
		*/
		
	    new Outer().new Inner().m1();
		
		
		
	}
	
	

}
