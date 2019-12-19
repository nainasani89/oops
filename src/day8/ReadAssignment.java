package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadAssignment {

	public static void main(String[] args) throws IOException {
		
		String locate = System.getProperty("user.dir")+"//testdata//Practicedata.properties";
		System.out.println(locate);
		
		FileInputStream fis = new FileInputStream(locate);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty("url");
		System.out.println(value);
		
		
	}

}
