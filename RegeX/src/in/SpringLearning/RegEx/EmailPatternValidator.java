package in.SpringLearning.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPatternValidator {

	public static void main(String[] args) {

		String emailId = "ayush131 gmail.com";

		String regex = "[a-z A-Z 0-9][a-z A-Z 0-9 ...]*@gmail[.]com";

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(emailId);

		if (m.find() && m.group().equals(emailId)) {
			System.out.println("Valid EmailId");
		} else {
			System.out.println("Invalid EmailId");
		}

	}

}
