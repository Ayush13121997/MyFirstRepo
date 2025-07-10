package in.SpringLearning.RegEx;

import java.util.regex.Pattern;

public class RegExSplitPattern {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\s");
		
		String[] s = p.split("My Coding World");
		
		for(String s1 :s)
		{
			System.out.println(s1);
		}
	}

}
