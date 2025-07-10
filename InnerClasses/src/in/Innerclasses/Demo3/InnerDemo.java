package in.Innerclasses.Demo3;

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		Outer.Inner i = o.new Inner();
		
		i.m1();

	}

}
