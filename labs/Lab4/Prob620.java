/**
 * file: Prob620.java
 * author: Nicole Padrazo 
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.3
 * 
 * This file contains problem )06_20
 */

import java.util.Scanner;

public class Prob620 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Prompting the user, establishing a variable
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    //returning a result
    System.out.println("The number of letters in the string is " 
    + countLetters(s));
  }

  //creating new method with foor loop 
  public static int countLetters(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        count++;
      }
    }

    //returning result 
    return count;
  
  }
}