package in.Multithreading.ThreadLocal;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal();
		
		System.out.println(tl.get());
		
		tl.set("ayush");

		System.out.println(tl.get());
		
		tl.remove();
		
		System.out.println(tl.get());
		
	}

}
