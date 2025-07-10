public class Instancevariables {
	
	int x;
	// for instance variable JVM will provide default values and we are not required to perform initialization explicitly

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(x);//Cannot make a static reference to the non-static field x
		Instancevariables t = new Instancevariables();
		final int x=20;
		System.out.println(t.x);
		
	}
	public void m1() {
		System.out.println(x);
	}

}
