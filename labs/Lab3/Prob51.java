/**
 * file: Prob51.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.3
 * 
 * This file contains problem 05_01
 */

import java.util.Scanner;

public class Prob51 {
	public static void main(String args[]) {

    //creatin new scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer. The input ends if it is 0: ");

    int p = input.nextInt();

    int np = 0; //number of positives
    int nn = 0; //number of negatives
    int sumn = 0; //sum of numbers 
    double avgn = 0; //average


    //creating the do while loop 
    if (p == 0)
      return;

    do {
      if (p>0)
        np++;
      else 
        nn++;

      sumn += p;

      p = input.nextInt();


    } while ( p != 0);

    avgn = sumn / ((double)(np + nn));

    //returning the answer to the user
    System.out.println("The number of positives is: " + np);
    System.out.println("The number of negatives is: " + nn);
    System.out.println("The total is " + sumn);
    System.out.println("The average is " + avgn);

	}
}