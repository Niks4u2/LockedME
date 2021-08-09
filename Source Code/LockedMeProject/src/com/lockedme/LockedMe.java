package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMe 
{
	static final String FOLDERPATH = "C:\\Users\\golun\\Desktop\\MyPhaseOneProject\\LockedMeFiles";
	
	public static void main(String[] args) 
	{
		
	}
	
	public static void getAllFileNames()
	{
		List<String> fileNames = FileManager.getAllFiles(FOLDERPATH);
		
		for(String fileName : fileNames)
			System.out.println(fileName);
	}
	
	public static void addFiles()
	{
		//Variable declaration
		Scanner scan = new Scanner(System.in);
		String fileName;
		int linesCount;
		List<String> content = new ArrayList<String>();
		
		//Read file name from user
		System.out.println("Enter file name: ");
		fileName = scan.nextLine();
		
		//Read number of lines from user
		System.out.println("Enter number of lines:");
		linesCount = Integer.parseInt(scan.nextLine());
		
		//Read lines from user
		for(int i = 1; i <= linesCount; i++)
		{
			System.out.println("Enter line "+i);
			content.add(scan.nextLine());
		}
		
		//Save content to file
		boolean isAdded = FileManager.createAndWriteToFile(FOLDERPATH, fileName, content);
		
		if(isAdded)
			System.out.println("File added successfully");
		else
			System.out.println("Some error occured");
	}
	
	public static void deleteFile()
	{
		String fileName;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter file name to be deleted: ");
		fileName = scan.nextLine();
		
		boolean isDeleted = FileManager.deleteFile(FOLDERPATH, fileName);
		
		if(isDeleted)
			System.out.println("File deleted successfully");
		else
			System.out.println("Either file is not present or some access issue");
	}
	
	public static void searchFile()
	{
		String fileName;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter file name to be searched: ");
		fileName = scan.nextLine();
		
		boolean isFound = FileManager.deleteFile(FOLDERPATH, fileName);
		
		if(isFound)
			System.out.println("File is present");
		else
			System.out.println("File is not present.");
	}

}