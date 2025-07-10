
public class StaticVariable {

    
	static int x =10;
	static String s;
	//	// for static variable JVM will provide default values and we are not required to perform initialization explicitly

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable s= new StaticVariable();
		System.out.println(s.x);
		System.out.println(StaticVariable.x);
		System.out.println(x);
		s.m1();

	}
	
	public void m1()
	{
		System.out.println(x);
		System.out.println(s);
		
	}

}
