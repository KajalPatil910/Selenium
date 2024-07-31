package genericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//File Library
public class Flib {
	public String fetchDataFromPropertries(String path,String key)  {
		
		File f =new File(path);
		Properties prop=null;
		try {
		FileInputStream fis = new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
		}
		catch (Exception e) {
			
		}
		String data =prop.getProperty(key);
		return data;
		
		
		
	}

}
