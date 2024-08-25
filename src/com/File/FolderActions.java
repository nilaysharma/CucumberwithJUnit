package com.File;

import java.io.File;

public class FolderActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folderPath = "C:\\JavaFolder";
		String NewFolderName = "C:\\JavaFolder1";

		createFolder(folderPath);
		Boolean checkFolder = checkFolderExists(folderPath);
		System.out.println(checkFolder);
		renameFolder(folderPath, NewFolderName);
		deleteFolder(NewFolderName);
	}

	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);

		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created:- " + folderPath);
		}
	}

	public static boolean checkFolderExists(String folderPath) {
		File folder = new File(folderPath);

		return folder.exists();

	}

	public static void renameFolder(String olderName, String NewName) {
		File oldfolder = new File(olderName);
		File newFolder = new File(NewName);

		if (oldfolder.exists()) {
			oldfolder.renameTo(newFolder);
			System.out.println("New Folder Name is:- " + NewName);
		}
	}
	
	public static void deleteFolder(String folderName) {
		File folder = new File(folderName);
		if(folder.exists()) {
			for(File files:folder.listFiles()) {
				files.delete();
			}
			folder.delete();
			System.out.println("Deleted folder name is:- "+folderName);
		}
	}
}
