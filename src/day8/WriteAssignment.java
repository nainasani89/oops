package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteAssignment {

	public static void main(String[] args) throws IOException {
		
		String locate = System.getProperty("user.dir")+"//testdata//Practicedata.properties";
		System.out.println(locate);
		
		FileOutputStream fos = new FileOutputStream(locate);
		Properties prop = new Properties();
		
		prop.setProperty("url", "www.google.com");
		prop.store(fos, "Practice wrtie data in file");
			

	}

}
