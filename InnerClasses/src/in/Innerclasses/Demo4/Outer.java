package in.Innerclasses.Demo4;

public class Outer {
	
	int x = 10 ;
	
	static int y = 20;
	
	class Inner
	{
		public void m1()
		{
			System.out.println(x);
			
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		
      new Outer().new Inner().m1();

	}

}
