/**
 * file: prob311.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem3.4 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 3.11
 */ 

import java.util.Scanner;

public class prob311 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Setting variable for month 
		int numberDaysMonth = 0;
		String nameOfMonth = "Unknown";

		//Prompting user for a number 
		System.out.print("Enter a number: ");
		int month = input.nextInt();

		//Promting user for a year 
		System.out.print("Enter year: ");
		int year = input.nextInt();

		//Switch case to receive answer of month 
		switch (month) {
			case 1: nameOfMonth = "January";
					numberDaysMonth = 31;
					break; 
			case 2: nameOfMonth = "February";
					numberDaysMonth = 28;
					break;
			case 3: nameOfMonth = "March";
					numberDaysMonth = 31;
					break;
			case 4: nameOfMonth = "April";
					numberDaysMonth = 30;
					break;
			case 5: nameOfMonth = "May";
					numberDaysMonth = 30;
					break;
			case 6: nameOfMonth = "June";
					numberDaysMonth = 30;
					break;
			case 7: nameOfMonth = "July";
					numberDaysMonth = 31;
					break;
			case 8: nameOfMonth = "August";
					numberDaysMonth = 31;
					break;
			case 9: nameOfMonth = "September";
					numberDaysMonth = 30;
					break;
			case 10: nameOfMonth = "October";
					numberDaysMonth = 31;
					break;
			case 11: nameOfMonth = "November";
					numberDaysMonth = 31;
					break; 
			case 12: nameOfMonth = "December";
					numberDaysMonth = 31;
		}

		//Returning the result back to the user 
		System.out.print(nameOfMonth + " " + year + "has" + numberDaysMonth + "days");



		
	}
}