package csvFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		
//		Approach 1
//		File file = new File(System.getProperty("user.dir")+"\\data\\example.csv");
//		
//		Scanner sc = new Scanner(file);
//		
//		sc.useDelimiter(",");
//		
//		while(sc.hasNext())//check whether line exists in csv file or not 
//		{
//			System.out.print(sc.next()+"\t");// here t is used to give tab space between values
//		}
//		sc.close();
		
//		Approach2: using java split method
		
		String filePth=System.getProperty("user.dir")+"\\data\\example.csv";
		
		FileReader file = new FileReader(filePth);
		
		BufferedReader bfr = new BufferedReader(file);
		
		String line;
		
		while((line=bfr.readLine())!=null) //here the line which we are reading should have some content
		{
			String arr[]=line.split(",");
			
			for(String data:arr) {
				System.out.print(data+"\t");
				
			}
			System.out.println();
		}
	}

}
