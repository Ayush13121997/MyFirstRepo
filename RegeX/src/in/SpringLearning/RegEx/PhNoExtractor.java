package in.SpringLearning.RegEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhNoExtractor {

	public static void main(String[] args) throws Exception {

		try (PrintWriter pw = new PrintWriter("output.txt")) {
			
			String regex = "(0|91)?[7-9]\\d{9}";
			
			Pattern p = Pattern.compile(regex);
			
			try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
				String line = br.readLine();
				
				while(line != null)
				{
					Matcher m = p.matcher(line);
					
					while(m.find())
					{
						pw.println(m.group());
					}
					
					line = br.readLine();
				}
			}
			
			pw.flush();
		}
		
		
		
	}

}
