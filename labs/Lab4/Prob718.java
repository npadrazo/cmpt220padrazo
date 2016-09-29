/**
 * file: Prob718.java
 * author: Nicole Padrazo 
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.3
 * 
 * This file contains problem )07_18
 */

import java.util.Scanner;

public class Prob718 {
  public static void main (String [] args) {

    //Creating new scanner
    Scanner input = new Scanner(System.in);

    //creating a new double list, prompting user 
    double [] myList = new double[10];
    System.out.print("Enter ten numbers: ");


    //creating for loop for list
    for (int i = 0; i < myList.length; i++) {
      myList[i] = input.nextDouble(); 
    }

    //establishing the bubbleSort for myList
    bubbleSort(myList);

    //returning the sorted list 
    System.out.println("My list after sort is: ");
    printList(myList);
  }

//creating new method for new list and for loop 
static void printList(double[] list) {
  for (int i = 0; i < list.length; i++)
    System.out.println(list[i]);
}

//creating new method for switching lists with boolean
static void bubbleSort(double[] list) {
  boolean different = true;
  do {
    different = false;
    for (int a = 0; a < list.length - 1; a++)
      if (list[a] > list[a + 1]) {
        double temp = list[a];
        list[a] = list[a + 1];
        list[a + 1] = temp;
        different = true;
      }
  } while (different);
 }
}