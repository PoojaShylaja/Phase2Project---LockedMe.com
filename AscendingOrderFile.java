package com.simplilearn.lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

      //To display files in ascending order

public class AscendingOrderFile {
	
	Scanner scan = new Scanner(System.in); 
	String fileName;
	int choice;
	File folder = new File ("F:\\Eclipe_Workshop\\Brocode\\Phase1Project\\Lockedme");
	ArrayList<String> list = new ArrayList<>();	
	
	// to show menu and accept input
	
	public void displayDetail() {
		
		do {
			System.out.println("\n1. Display file names in Ascending Order");
			System.out.println("2. Back to Main Menu");
			
			
			try{	
				System.out.print("\n1"+"Enter Choice : ");
				choice = scan.nextInt();
			   }
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				//AscendingOrderFile ao = new AscendingOrderFile();
				displayDetail();
			                                }
						
			
			if (choice==1)
			{AscendingOrderFile aof = new AscendingOrderFile();aof.ascendingOrder();}
			else if(choice==2)
			{LockedMe lm = new LockedMe();lm.menuDisplay();}
			else
			{System.out.println("Invalid Option. Please enter valid option.");break;}
		}
		while(choice!=2);		
	}
	
	
	public void ascendingOrder() {	
		
      String[] presentFiles  = folder.list();
      
      
      if  (presentFiles == null)
          {System.out.println( "Directory Empty.");}
      else
          { for (int i = 0; i< presentFiles.length; i++)
          {String filename = presentFiles[i];
           list.add(filename);
          }
          }  
      
      Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
      System.out.println("\nFiles in Ascending Order : " + list);
			
	                           }
	
}
