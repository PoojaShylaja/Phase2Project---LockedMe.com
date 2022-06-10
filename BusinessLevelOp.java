package com.simplilearn.lockedme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusinessLevelOp {
	
	Scanner scan = new Scanner(System.in);	
	int choice;
		
	public void displayDetails() {
		
		    //menu for display
		
		do {
			System.out.println("\nSelect one of the options ");
			System.out.println("1. Add file to the existing folder");
			System.out.println("2. Delete a file from the folder");
			System.out.println("3. Search for a file");
			System.out.println("4. Go to main Menu");
			
			// User input
			
			try{	
				System.out.print("\n"+"Enter Choice : ");
				choice = scan.nextInt();
			   }
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
		   //BusinessLevelOp d = new BusinessLevelOp();
				displayDetails();
			                                }
			
			
			switch(choice) {
				case 1:
					AddAFile fileName1 = new AddAFile();
					fileName1.addFile();					
					break;
				case 2:
					DeleteAFile fileName2 = new DeleteAFile();
					fileName2.deleteFile();
					break;
				case 3:
					SearchAFile filename3 = new SearchAFile();
					filename3.searchFile();
					break;
				case 4:
					LockedMe lockedMe = new LockedMe();
					lockedMe.menuDisplay();
					break;
				default:
					System.out.println("Invalid Option.Please enter a valid option.");
					break;
			             }
			
		  }
		while(choice!=4);		
	                             }

	
		
	                       }
	


