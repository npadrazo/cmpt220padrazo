/*
 * file: Prob3.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.3
 * 
 * This file contains problem 06_03.
 */

import java.util.Scanner;

public class Prob63 {
  public static void main(String[] args) {

    //Creating a new scanner and integer
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();


    //if statement to return answer to user 
    if (isPalindrome(number)) {
        System.out.println(number + " is a palindrome ");
    } else {
        System.out.println(number + " isn't a palindrome ");
    }
  }
  

  //new method to evaluate reverse numbers 
  public static int reverse (int number) {
    int reverse = 0;
    while (number != 0) {

    reverse *= 10;
    reverse += number % 10;
    number /= 10;
    }

    return reverse;
  }
  //new method to evaluate numbers 
  public static boolean isPalindrome(int number) {
    return (number == reverse(number));
  }
}

