package com.simplilearn.lockedme;

import java.io.File;
import java.util.Scanner;

    //To Delete a file from the folder

public class DeleteAFile {
	
	
	Scanner scan = new Scanner(System.in);
	String fileName;
	File folder = new File ("F:\\Eclipe_Workshop\\Brocode\\Phase1Project\\Lockedme");
	
	// to display file and ask for the file that need to be deleted
	
	public void deleteFile() {
		
		DeleteAFile fileName2 = new DeleteAFile();		
		System.out.println("\nFiles Present : ");
		fileName2.toDisplayFile();
		
		
		System.out.print("\n"+"Enter file name that need to be deleted : ");
		fileName = scan.next(); // object of scanner class required
		fileName2.toDeleteFile(fileName);
	                         } 
	
	
	
	  //Displaying the files after deletion
	
	public void toDisplayFile() {	
		
      String[] filesFound = folder.list();
      
      if (filesFound == null) 
           {System.out.println( "\n"+"No Files Present");} 
      else 
           { for(String str:filesFound) 
    	      {System.out.println(str);}
    	   }
	                             }
	//Deleting file from the folder
	
		public void toDeleteFile(String fileName) {	
			
			File file = new File(folder, fileName); 
			
			if (file.delete())
				System.out.println("\n"+"File has been Deleted : " + file.getName());      
		    else
		    	System.out.println("\n"+"File has not been found.");
		                                          }

}
