package in.File;

import java.io.File;

public class TestDemo {

	public static void main(String[] args) {

		int count1 = 0;
		int count2 = 0;
		
		File f = new File("/Users/Ayush/Downloads");

		String[] s = f.list();

		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isFile()) {
				count1++;
				//System.out.println(s1);
			}

			for (String s2 : s) {
				File f2 = new File(f, s2);
				if (f2.isDirectory()) {
					count2++;
					System.out.println(s2);
				}
			}
		}

		//System.out.println("The Total Number : " + count1);
		System.out.println("The Total Number : " + count2);
	}

}
