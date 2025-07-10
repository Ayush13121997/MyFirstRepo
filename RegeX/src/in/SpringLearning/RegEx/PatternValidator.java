package in.SpringLearning.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternValidator {

	public static void main(String[] args) {

		String phnNo = "918601566644";
		
		String regex = "(0|91)?[7-9]\\d{9}";

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(phnNo);

		if (m.find() && m.group().equals(phnNo)) {
			System.out.println("valid mobile number.");
		} else {
			System.out.println(" Invalid mobile number.");
		}

	}

}
