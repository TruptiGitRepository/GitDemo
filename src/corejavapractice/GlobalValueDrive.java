package corejavapractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\naray\\eclipse-workspace\\corejavapractice\\data.properties");
		prop.load(fis);  // read from property file
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser")); //setting property value at runtime
		FileOutputStream fos= new FileOutputStream("C:\\Users\\naray\\eclipse-workspace\\corejavapractice\\data.properties");
		
		prop.store(fos, null); // write to property file
}
}
