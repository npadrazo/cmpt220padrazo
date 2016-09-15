/**
 * file: prob48.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem4-8
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 4.8
 */ 


public class prob48{
	public static void main(String args[]) {
		//Creating new scanner 
		java.util.Scanner input = new java.util.Scanner(System.in);

		//Prompting user for a code 
		System.out.println("Enter a ASCII code");
		int code = input.nextInt();

		//Retuning the results to user 
		System.out.println("The character for ASCII code " + code
		  + " is " + (char)code);
	}
}