package in.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("abc.txt",true);//to append the data to the file if exists
		//FileWriter fw= new FileWriter("abc.txt");//to override the existing data
		fw.write(100);
		fw.write("\nayush\nCodingWorld");
		fw.write('\n');
		
		char[] ch = {'a','b','c','d'};
	
		fw.write(ch);
		
		fw.write('\n');

		fw.flush();
		
		fw.close();
	}

}
