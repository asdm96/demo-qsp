package dataDrivenTesting;

import java.io.FileInputStream;

import java.util.Properties;

public class GetTheDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		String filePath="./resources/prop.properties";
		//Pass the physical file path to the constructor of fileInputStream class
		FileInputStream file = new FileInputStream(filePath);
		// object of properties class from java, to load the physical file
		Properties properties = new Properties();
		//load the file
		properties.load(file);
		//fetch all data using key given in the property file
		String URL = properties.getProperty("url");
		String userName=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		//print the value
		System.out.println(URL);
		System.out.println(userName);
		System.out.println(password);

	}

}
