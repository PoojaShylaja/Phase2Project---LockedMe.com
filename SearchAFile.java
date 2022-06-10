package com.simplilearn.lockedme;

import java.io.File;
import java.util.Scanner;

         //To Search for a file from the folder

public class SearchAFile {
	
	Scanner scan = new Scanner(System.in);
	File folder = new File ("F:\\Eclipe_Workshop\\Brocode\\Phase1Project\\Lockedme");//Path given
	String fileName;
	
	     //to ask for the file need to be searched
	
	public void searchFile() {
		 
		System.out.print("\n"+"Enter name of the file that need to be searched : ");
		fileName = scan.next(); //file that need to be searched stored
		
		toSearchAFile(fileName);
	}
	
	    //Searching the list to check if the file is present
	BusinessLevelOp blo = new BusinessLevelOp();
	
	public void toSearchAFile(String fileName) {
		
		String contentsOfFolder[] =folder.list();
		
		//for each loop
		for(String str:contentsOfFolder) {
			if(str.equalsIgnoreCase(fileName)) {
				System.out.println("\n"+"File "+fileName+" is found");
				blo.displayDetails();
			                             }
			                                   }
		
			 System.out.println("\n"+"File Not found");
			      blo.displayDetails();
		
		

	}
	
}
