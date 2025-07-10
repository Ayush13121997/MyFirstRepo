package in.SpringLearning.RegEx;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FIleNameExtractor {

	public static void main(String[] args) {

		int count =0 ;
		
		String fileName = "[a-z A-Z 0-9 _$.]+[.] ";
		
		Pattern p = Pattern.compile(fileName);
		
		File f = new File("/Users/Ayush/eclipse-workspace/RegeX/src/in/SpringLearning/RegEx");
		
		String[] s = f.list();
		
		for(String s1 : s)
		{
			Matcher m = p.matcher(s1);
			
			if(m.find() && m.group().equals(s1))
			{
				count++ ;
				
				System.out.println(s1);
			}
		}
		
		System.out.println(count);
	}

}
