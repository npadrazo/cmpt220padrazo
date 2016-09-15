/**
 * file: Prob426.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem4.26 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 4.26
 */ 

import java.util.Scanner;

public class prob426 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// Prompting the user to enter a value 
		System.out.print(
			"Enter an amount in double, for example 11.56%: ");
		String amString = input.nextLine (); 

		// Setting a variable to do an index 
		int decimalPosition = amString.indexOf('.');


		int amount;

		//If statement for the index to occur 
		if (decimalPosition == -1) {
			amount = Integer.parseInt(amString);
		}
		else {
			String fractionPart = amString.substring(decimalPosition + 1);

			if (fractionPart.length() >=2 ) {
				fractionPart = fractionPart.substring(0, 2);
			}
			else if (fractionPart.length() == 1) {
				fractionPart = fractionPart + "0";
			}
			else {
				fractionPart = fractionPart + "00";
			}
		//Setting the amount for the math for variables below 
		amount = Integer.parseInt( 
			amString.substring(0, decimalPosition) + fractionPart);
		}

		//Variable for the amount 
		int remAmount = amount; 

		//Variable to return number for dollars
		int numDollars = remAmount / 100;
		remAmount = remAmount % 100;

		//Variable to return the number of quarters 
		int numQs = remAmount / 25;
		remAmount = remAmount % 25;

		//Variable to return the number of dimes 
		int numDs = remAmount / 10;
		remAmount = remAmount % 10;

		//Variable to return the number of nickels 
		int numNs = remAmount / 5;
		remAmount = remAmount % 5;

		//Variable to return the number of pennies 
		int numPs = remAmount;

		//Gives the user the result 
		System.out.println("The amount " + amString + " has \n" + 
			"\t" + numDollars + " dollars\n" +
			"\t" + numQs + " quarters\n" + 
			"\t" + numDs + " dimes\n" +
			"\t" + numNs + " nickles\n" + 
			"\t" + numPs + " pennies\n"); 	
		
		
	}
}