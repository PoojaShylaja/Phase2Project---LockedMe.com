package com.simplilearn.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

        //to add a file
public class AddAFile {
	
	Scanner scan = new Scanner(System.in);
    String fileName;

	
	
	public void addFile() {
		
		System.out.print("\n"+"Enter file name that need to be added : ");
		fileName = scan.next();
		
		
		AddAFile fileName1 = new AddAFile();
		fileName1.toAddFile(fileName);
	                      }

    // to add a file and to check whether file exists,if it exists  ask for other name
	
	public void toAddFile(String fileName) {
		
		File folder = new File ("F:\\Eclipe_Workshop\\Brocode\\Phase1Project\\Lockedme");
		File file = new File(folder, fileName);
		
		try {
			if (file.createNewFile())
			     {System.out.println("\n"+"Created File name : " + file.getName());}
			
			else {
		    	  System.out.println("\n"+"File already exists. Please enter another name");
		    	  AddAFile fileName1 = new AddAFile();
		    	  fileName1.addFile();
		         }
			
		    } 
		
		catch (IOException e) {
		                        e.printStackTrace();
		                      }
		

                                          }
}