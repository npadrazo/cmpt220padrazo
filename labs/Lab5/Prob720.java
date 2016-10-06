/**
 * file: Prob720.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.3
 * 
 * This file contains problem 7.20
 */

import java.util.Scanner;

public class Prob720 {
  public static void main(String[] args) {


    //initilizing the list
    double[] myList = new double[10];

    Scanner input = new Scanner(System.in);

    //prompting the user to enter list of numbers
    System.out.println("List 10 numbers: ");
    for (int i = 0; i < myList.length; i++) {
      myList[i] = input.nextDouble();
    }

    //sorting the list 
    selectionSort(myList);



    //returning the sorted list to user 
    System.out.println("Sorted list: ");
    printList(myList);
  }

  //creating new method
  static void printList (double[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }  

  //creating new method 
  static void selectionSort(double[] list) {
    double currentMin;
    int currentMinIndex;


    //finding the smallest numner in list
    for (int i = 0; i < list.length; i++) {
      currentMin = list[i];
      currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }  
 
      //Swapping list 
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
}