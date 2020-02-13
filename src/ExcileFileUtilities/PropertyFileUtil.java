package ExcileFileUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {
	
	public static  String getValueForKey(String Key) throws Exception {
		FileInputStream fis=new FileInputStream("./PropertiesFile/Environment.properties");
		Properties ConfigProperties=new Properties();
		ConfigProperties .load(fis);
		return ConfigProperties.getProperty(Key);
		
	}

}
