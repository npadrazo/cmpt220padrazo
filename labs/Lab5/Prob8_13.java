/**
 * file: Prob8_13.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.3
 * 
 * This file contains the Problem 8.13
 **/

import java.util.Scanner;

public class Prob8_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Prompting user to enter 
    System.out.print("Enter the number of rows and columns: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];



    //Prompting user to enter 
    System.out.println("Enter the array below: ");
    for (int i = 0; i < row; i++)
      for (int j = 0; j < column; j++)
        m[i][j] = input.nextDouble();

    int[] location = largest(m);
    System.out.printf("The location is at ", location[0], location[1]);
  }


  //creating new method
  public static int[] largest(double[][] n) {

    int[] location = new int[] { 0, 0 };
    double biggest = n[0][0];
    for (int k = 0; k < n.length; k++) {
      for (int m = 0; m < n[k].length; m++) {
        if (n[k][m] > biggest) {
          location[0] = k;
          location[1] = m;
          biggest = n[k][m];
        }
      }
    }

    //returning the location
    return location;
  }
}