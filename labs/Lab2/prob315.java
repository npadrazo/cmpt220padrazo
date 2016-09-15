/**
 * file: Prob315.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem3.15
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 3.15
 */ 


import java.util.Scanner; 

public class prob315 {
	public static void main(String[] args) {
		//Setting variable to do the random math 
		int number = (int)(Math.random() * 1000);

		//Prompting the user to enter a number 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three digit number: ");
		int guess = input.nextInt(); 

		//Writing the math for the lottery to function
		int lD1 = number / 100;
		int lD2 = number % 100 / 10;
		int lD3 = number % 10;

		//Writing the math for the lottery to function 
		int gD1 = guess / 100;
		int gD2 = guess % 100 / 10;
		int gD3 = guess % 10;

		//Printing out the result to the user 
		System.out.println("The lottery numner is " + number);

		//Creating the staement for the lottery to run 
 		if (guess == number) {
 			System.out.println("Congrats. You win $10,000!!!!"); 
 		} else if (((gD2 == lD1) 
 			&& (gD1 == lD2)
 			&& (gD3 == lD3)) ||
 			((gD1 == lD1) && (gD3 ==lD2) && (gD2 == lD3)) ||
 			((gD3 == lD1) && (gD1 == lD2) && (gD2 == lD3)) ||
 			((gD2 == lD1) && (gD3 == lD2) && (gD1 == lD3)) ||
 			((gD3 == lD1) && (gD2 == lD2) && (gD1 == lD3))) {
 			System.out.println("Congrats. You win &3,000!!!!");
 		} else if ((gD1 == lD1) || (gD1 == lD2) || (gD1 == lD3) || 
 			(gD2 == lD1) || (gD2 == lD2) || (gD2 == lD3) ||
 			(gD3 == lD1) || (gD3 == lD2) || (gD3 == lD3)) {
 			System.out.println("Congrats. You win $1,000!!!!");
 		} else {
 			System.out.println("No match. Play again?");
 

		}

	}
}