package com.simplilearn.lockedme;

import java.util.InputMismatchException;
import java.util.Scanner;

      // main program to display the front page
public class LockedMe {
	
	static Scanner scan = new Scanner(System.in);//to enter input
	static int choice;	
	
	
	 //main menu
	public static void main(String[] args) {
		
		System.out.println("                                    LockerMe.com                            ");
		System.out.println("                                              -Developed By Pooja"                           );	
		System.out.println(" *************************************************************************************** ");
		
		LockedMe lm = new LockedMe();
		lm.menuDisplay();
	                                        }
	
	
	
	
	  //To display contents for the main menu
	
	public void menuDisplay() {
		
		do {			
			System.out.println("\nMain Menu");
			System.out.println("---------");
            //System.out.println("\n ");
			System.out.println("1. Display File Names in Ascending Order");
			System.out.println("2. Display business Level Operation");
			System.out.println("3. Close");
			System.out.println("\n ");
			
			
			try{	
				System.out.print("Enter your Choice : ");
				choice = scan.nextInt();
			   }
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
		        menuDisplay();
			                                }
			
	//For choosing the correct operation
			
			switch(choice) {
				case 1:
					AscendingOrderFile aof = new AscendingOrderFile();// Created another class
					aof.displayDetail();
					break;
				case 2:
					BusinessLevelOp blo = new BusinessLevelOp();// Created another class
					blo.displayDetails();
					break;
				case 3:
					System.out.println("\n");
					System.out.println("\n");
					System.out.println("Thank youfor visiting us!");
				    break;
				default:
					System.out.println("Invalid Option.Please enter a valid option.");
			              }
		 }
		while( choice!=3 );


		                              }
	}
