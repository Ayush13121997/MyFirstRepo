package in.Innerclasses.Demo7;

public class Test {
	
	
	public void m1()
	{
		
		class Inner
		{
			public void sum(int x , int y)
			{
				System.out.println("The Sum : " + (x+y));
			}
		}
		
		Inner i = new Inner();
		
		i.sum(20, 30);
		
		i.sum(40, 70);
		
		
		i.sum(98, 25);
		
		
		
	}

	public static void main(String[] args) {
		
		Test t =  new Test();
		
		t.m1();
		

	}

}
