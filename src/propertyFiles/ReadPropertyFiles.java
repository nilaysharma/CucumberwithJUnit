package propertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();

		String filePath = System.getProperty("user.dir") + "\\data\\example.properties";
//		since we are reading the file therefore using fileInputStream
		FileInputStream fis = new FileInputStream(filePath);
		
		properties.load(fis);
		
		fis.close();
		
		String name= properties.getProperty("name");
		String age= properties.getProperty("age");
		String email= properties.getProperty("email");
		
		System.out.println(name+" "+age+" "+email);
		
//		capture all properties name
		Set<String> keynames=properties.stringPropertyNames();
		System.out.println(keynames);
		
//		capture all properties name
		Set<Object> key2=properties.keySet();
		System.out.println(key2);
		
//		get all properties key values
		Collection<Object> values=properties.values();
		System.out.println(values);
		
		for(String key: properties.stringPropertyNames())
		{
			System.out.println(key+" "+properties.getProperty(key));
		}
	}

}
