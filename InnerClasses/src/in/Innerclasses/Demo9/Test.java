package in.Innerclasses.Demo9;

public class Test {

	public void m1()
	{
		// by default it is considered as final if it is declared and initialized and won't be reassigned again
		
		int x =10;
		
		//x=20; if we uncomment this line then we have to declare 'x' as final 
		
		class Inner
		{
			public void m2()
			{
				System.out.println(x);
			}
		}
		
		Inner i = new Inner();
		
		i.m2();
		
		
		
	}
	public static void main(String[] args) {
		

		Test t = new Test();
		
		t.m1();
		

	}

}
