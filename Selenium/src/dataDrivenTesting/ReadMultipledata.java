package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadMultipledata {

	public static void main(String[] args) throws Throwable {
		String filePath="./resources/prop.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties properties = new Properties();
		properties.load(file);
		
		Set<Object> keySet = properties.keySet();
		for(Object key:keySet) {
			System.out.println(key);
			System.out.println(properties.get(key));
		}	

	}

}
