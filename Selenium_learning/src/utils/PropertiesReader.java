package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesReader {

	private Properties properties;
	private final String propertyFilePath = "src/config/config.properties";

	public  PropertiesReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}
	}
	
	public String getAppUrl() {
		return properties.getProperty("applicationurl");
//		if (url!=null) return url;
//		else throw new RuntimeException("url is not specified in the Configuration.properties file."); 
		
	}

	public String userName() {
		return properties.getProperty("user");
		
	}
	public String password() {
		return properties.getProperty("password");
		
	}
	
	public String displayName() {
		return properties.getProperty("displayName");
		
	}

}

