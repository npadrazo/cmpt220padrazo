/**
 * file: Prob12_03.java
 * author: nicole padrazo
 * course: CMPT 220
 * assignment: project 1
 * due date: november 10, 2016
 * version: 1.3
 * 
 * This file contains problem 12_03
 */

import java.util.Scanner;

public class Prob12_03 { 
  public static void main(String[] args) {

    //creating array
    int[] array = new int[100];
    for(int a = 0; a < array.length; a++) {
      array[a] = (int)(Math.random() * 100);
    }

    //prompting the user to enter
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the index of the array: ");
    
    //returning answer to user, reprompting upon out of bounds 
    try {
      int index = input.nextInt();
      System.out.print("array" + index + " = " + array[index]);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Index is out of bounds");
    }
  }
}