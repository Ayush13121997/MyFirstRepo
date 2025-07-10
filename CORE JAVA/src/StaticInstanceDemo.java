
public class StaticInstanceDemo {

	static int x= 10;
	int y =20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInstanceDemo s1 = new StaticInstanceDemo();
		s1.x= 999;
		s1.y =888;
		
		StaticInstanceDemo s2 = new StaticInstanceDemo();
		System.out.println(s2.x + "...." +s2.y);
     
	}

}
