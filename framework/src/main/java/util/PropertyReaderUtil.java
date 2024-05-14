package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {

	public String getproperty(String key) throws IOException
	{
		String filepath= System.getProperty("user.dir")+"\\src\\test\\resources\\variables.properties";
		FileReader fileReader = new FileReader(filepath);
        Properties properties = new Properties();
        properties.load(fileReader);
		//Object propertyName;
		//return properties.getProperty(propertyName, defaultValue);
		return key;
		
	}
}
