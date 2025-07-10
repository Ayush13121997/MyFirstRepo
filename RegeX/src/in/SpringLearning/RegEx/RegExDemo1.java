package in.SpringLearning.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		

		int count = 0;
		
		//String s ="ab";
		//String s ="[abc]";
		
		//String s ="[^abc]";
		
		//String s ="[a-z]";
		
		
		//String s ="[A-Z]";
		
		//String s ="[0-9]";
		
		//String s= "[a-z A-Z 0-9]";
		
		//String s ="a+";
		
		//String s = "\\s";
		
		//String s = "\\S";
		
//		String s = "\\d";
		
//		String s = "\\D";
//		
//		String s = "\\w";
//		
//		String s = "\\W";
//		
//		String s = ".";
		
//		String s = "b";
//		String s = "b+";
//		String s = "b*";
		String s = "b?";
		
		Pattern p = Pattern.compile(s);
		
		Matcher m = p.matcher("abbabbba");
		
		//Matcher m= p.matcher("a7 bk@9z");
		
		while(m.find())
		{
			++count ;
			System.out.println(m.start() + "...." + m.end() + "....." + m.group());
		}

		System.out.println("The total number of occurences : " + count);
	}

}
