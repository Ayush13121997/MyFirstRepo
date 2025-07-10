package in.SpringLearning.RegEx;

public class StringClassSplit {

	public static void main(String[] args) {

		String s = "ayush131@gmail.com";
		
		String[] s1 = s.split("\\.");
		
		for( String s2 : s1)
		{
			System.out.println(s2);
		}
	}

}
