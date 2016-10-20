/**
 * file: Prob9_13.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: lab 6
 * due date: October 20, 2003
 * version: 1.3
 * 
 * This file contains Problem 9_13
 */

import java.util.Scanner;

public class Prob9_13 {
  public static void main(String[] args) {


    //creating scanner and initilizing variables 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];


    //creating array
    System.out.println("Enter the array: ");
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = input.nextDouble();
      }
    }
    
    //returning location
    Location location = Location.locateLargest(m);

    //returing result to user
    System.out.println("The location of the largest element in array is "
      + location.maxValue + " at " + location.row + ", " + location.column);
    
  }
}