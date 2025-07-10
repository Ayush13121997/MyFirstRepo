package in.Collection.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		File file = new File("/Users/Ayush/eclipse-workspace/Collection/src/in/Collection/Property" ,"login.properties");
		
		// Check if the file exists
		if (!file.exists()) {
			System.out.println("File does not exist: " + file.getAbsolutePath());
			return; // Exit if the file does not exist
		}

		FileInputStream fis = new FileInputStream(file);

		p.load(fis);

		System.out.println(p);

		String s = p.getProperty("Ayush");

		System.out.println(s);

		p.setProperty("TCS", "ayush12345");

		FileOutputStream fos = new FileOutputStream(file);

		p.store(fos, "Updated By Ayush For checking Purpose");

	}

}
