package in.Innerclasses.StaticNested4;

public interface Outer {
	
	public void m1();
	
	interface Inner
	{
		public void m2();
		
	}
	
	class Test1 implements Outer
	{
		public void m1()
		{
			System.out.println("Outer Inteface Method Implementation");
		}
	}
	
	class Test2 implements Outer.Inner
	{
		public void m2()
		{
			System.out.println("Inner Inteface Method Implementation");
		}
	}

}
