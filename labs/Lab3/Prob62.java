/**
 * file: Prob62.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.3
 * 
 * This file contains problem 06_02
 */

import java.util.Scanner;

public class Prob62 {
  public static void main(String[] args) {

    //creating new scanner 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int value = input.nextInt();

    System.out.println("The sum of digits for " + value + 
      " is " + sumD(value));
  }

  //establishing variables 
  public static int sumD(long n) {
    int temp = (int)Math.abs(n);
    int sum = 0;

    while (temp != 0) {
      int remainder = temp % 10;
      sum += remainder;
      temp = temp / 10;
    }

    return sum;
  }
}