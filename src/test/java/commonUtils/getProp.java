package commonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getProp {
	
	
	public String getProperties(String name) throws IOException
	{
		String path = "C:\\Users\\chinn\\eclipse-workspace\\finalTesting\\src\\test\\java\\testData\\testData.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(name);
	}

}
