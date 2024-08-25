package propertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		
		properties.setProperty("name", "Nilay Sharma");
		properties.setProperty("email", "nilay.sharma9812@gmail.com");
		properties.setProperty("age", "26");
		
		String filePath= System.getProperty("user.dir")+"\\data\\example.properties";
//		since we are writing the file therefore using fileOutputStream
		FileOutputStream fos = new FileOutputStream(filePath);
		
		properties.store(fos, "Sample date in propeties file..");
		
		fos.close();
		
		System.out.println("data inserted successfully..");
	}

}
