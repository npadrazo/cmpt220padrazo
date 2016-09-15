/**
 * file: Prob41.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem3.4 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 4.1
 */ 

import java.util.Scanner;

public class prob41 {
	public static void main(String[] args) {
		//Creating new scanner 
		Scanner input = new Scanner(System.in);

		//Setting variable equal to y for answer from user 
		String y;
		y = "Enter the length from the center of a pentagon to a vertex";
		System.out.println(y);

		//Setting double variable 
		double radius = input.nextDouble();
		input.close();

		//Doing the math for the formula 
		double side = 2 * radius * Math.sin(Math.PI / 5);
		double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

		//Retuning answer back to user
		System.out.print("The area of the pentagon is" + area);

	}
}