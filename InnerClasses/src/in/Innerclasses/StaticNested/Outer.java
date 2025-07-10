package in.Innerclasses.StaticNested;

public class Outer {

	static class Nested {
		public void m1() {
			System.out.println("Static class nested Method");
		}
	}

	public static void main(String[] args) {

		Nested n = new Nested();
		
		n.m1();
		
		
	}

}
//if we want to create Netsed Object outside Outer Class then we can create as follows :
//  Outer.Nested n = new Outer.Nested();