/**
 * file: Prob45.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem3.4 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 4.5
 */ 

import java.util.Scanner;

public class prob45 {
	public static void main(String[] agrs) {

		//Prompting an input from the user 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");

		//Prompting an input from the user 
		double numberOfSides = input.nextDouble();
		System.out.print("Enter the side: ");

		//Setting a double variable 
		double len = input.nextDouble();
		input.close();

		//Doing the math for the formula 
		double area = (numberOfSides * len * len) / (4.0 * Math.tan(Math.PI / 
			numberOfSides));

		//Returnong results to user
		System.out.print("The area of the polygon is" + area);
	}
}