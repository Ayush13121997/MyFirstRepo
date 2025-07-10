package in.File;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		
		f.createNewFile();
		
		File f2 = new File("java");

		f2.mkdir();
		
		File f1 = new File("java" ,"demo.txt");
		
		f1.createNewFile();
		
		System.out.println(f1.exists());
		
		File f3 = new File("/Users/Ayush/Downloads/JAVA" ,"abc.txt");
		
		f3.createNewFile();
		
		System.out.println(f3.delete());
		
		System.out.println(f2.isDirectory());
		
		System.out.println(f.length());
		
		System.out.println(f3.list());
		
	}

}
