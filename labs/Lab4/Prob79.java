/**
 * file: Prob79.java
 * author: Nicole Padrazo 
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.3
 * 
 * This file contains problem )07_09
 */

import java.util.Scanner; 

public class Prob79 {
  public static void main(String[] args) {

    //csetting variable 
    double[] number = new double[10];
    Scanner input = new Scanner(System.in);


    //prompting the user to enter an input, creating for loop
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < number.length; i++) 
      number[i] = input.nextDouble();

    //returning a result to user 
    System.out.println("The minimum number is " + minimum(number));

  }

public static double minimum(double[] array) {

    //creating for loop for is statement
    double minimum = array[0];
    for (int i = 0; i < array.length; i++) {

      if (minimum > array[i]) minimum = array[i];
    }

    //returning result 
    return minimum;
  }
}