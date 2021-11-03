package demoactitimePom;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyUtils {
	public String getPropertyData(String filePath,String key ) throws Throwable {
		FileInputStream file = new FileInputStream(filePath);
		Properties properties = new Properties();
		properties.load(file);
		return properties.getProperty(key);
		
	}

}
