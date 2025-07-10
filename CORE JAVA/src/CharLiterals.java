
public class CharLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can specify char literals as single character within single quotes
		char ch ='a';
		//char ch1 =b;
		//char ch2 ="c";
		//char ch3 ='bc';
		
		char ch4 =97;
		char ch5 =0777;
		char ch6 =65535;
		//char ch7 =65536;
		//we can specify char literal as integral literals which represent Unicode values of the character and allowed range is 0 to 65535
		
		
		char ch8 = '\u0061';
		
		// we can specify char literal in Unicode Representation
		
		char ch9 ='\n'; //new line 
		char ch10 ='\t';//Horizontal Tab
		char ch11 ='\"';//double quote
		char ch12 = '\\';//back slash
		char ch13 = '\f';//form feed
		char ch14 ='\r';//carriage return
		char ch15 ='\b';//back space
		
		
		//every escape character is a valid char literal
		
		
		
		System.out.println(ch + " "+ch4 + " "+ch5 +" "+ ch6 + " "+ ch8+" "+ch9+" "+ch10+" "+ ch11 + " "+ch12+" "+ch13+ " "+ch14+" "+ch15);
	}

}
