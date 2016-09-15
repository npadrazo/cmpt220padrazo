/**
 * file: calc.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem 2
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 2
 */ 

import java.util.Scanner;
public class calc {
	public static void main (String[] Strings) {
	Scanner input = new Scanner(System.in);
	double midtermgrade;
	double finalexam;
	double projects;
	double homeworkandlabs;

	System.out.print("midterm grade: ");
	midtermgrade = input.nextDouble();

	System.out.print("final exam: ");
	finalexam = input.nextDouble();

	System.out.print("projects: ");
	projects = input.nextDouble();

	System.out.print("homework and labs: ");
	homeworkandlabs = input.nextDouble();

	input.close();

	double total = (midtermgrade + finalexam + projects + homeworkandlabs) / 4;

	System.out.print("Your final grade is: " + total);

	if (total > 90) 
		System.out.println("A");
	else if (total > 80)
		System.out.println("B");
	else if (total > 70)
		System.out.println("C");
	else if (total > 60)
		System.out.println("D");
	else 
		System.out.println("F");

	}
}