package in.SpringLearning.RegEx;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer st =  new StringTokenizer("19-09-2025" ,"-");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		

	}

}
