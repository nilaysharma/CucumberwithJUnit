package com.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\myFiles\\myfile.txt";
		createFile(filePath);
		writeFile(filePath);
		readFile(filePath);
		String newfilePath="C:\\myFiles\\myfile1.txt";
		renameFile(filePath, newfilePath);
		
		deleteFile(newfilePath);
	}

	public static void createFile(String filePath) throws IOException {
		File myObj = new File(filePath);
		
		if(myObj.createNewFile()) {
			System.out.println("New file created "+myObj.getName());
		}
		else {
			System.out.println("file already exists");
		}
	}
//	writing data into a text file we can also use fileInputStream
	public static void writeFile(String filePath) throws IOException {
		FileWriter writer = new FileWriter(filePath);
		writer.write("welcome to Java");
		writer.close();
		System.out.println("written successfully..");
	}
	
//	reading data from the txt file
	public static void readFile(String filePath) throws FileNotFoundException {
		File myObj= new File(filePath);
		
		Scanner sc = new Scanner(myObj);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}
	
//	renaming the existing file
	public static void renameFile(String oldfilepath,String newfilepath) {
		File oldfile=new File(oldfilepath);
		File newfile = new File(newfilepath);
		
		if(oldfile.renameTo(newfile)) {
			System.out.println("changed the file name successfully...");
		}
		else {
			System.out.println("file cannot be renamed");
		}
	}
	
//	Delete the file
	public static void deleteFile(String filepath) {
		File myObj = new File(filepath);
		if(myObj.delete()) {
			System.out.println("Successfully deleted the file "+myObj.getName());
		}
		else {
			System.out.println("Failed to delete the file..");
		}
	}
}
