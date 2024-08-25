package csvFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String csvfile= System.getProperty("user.dir")+"\\data\\example.csv";
		
		FileWriter writer = new FileWriter(csvfile);
		
		writer.append("name,email,age,\n");
		writer.append("Nilay,nilay.sharma9812@gmail.com,26,\n");
		writer.append("Shubhankar,shubhu@gmail.com,24,\n");
		writer.append("Ravi,ravi27@gmail.com,27,\n");
		
		writer.close();
		System.out.println("Data inserted successfully...");
		
	}

}