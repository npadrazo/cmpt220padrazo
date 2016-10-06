/**
 * file: Prob7_32.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.3
 * 
 * This file contains Problem 7_31 
 */

import java.util.Scanner;

public class Prob7_32 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);


  //Prompting the user to enter a list, creating array
  System.out.print("Enter a list: ");
  int size = input.nextInt();
  int[] list = new int[size];
  for (int i = 0; i < list.length; i++)
    list[i] = input.nextInt();

  parition(list);


  //Returning the partitnioned list, creating array
  System.out.print("After the partition, the list is: ");
  for (int i = 0; i < list.length; i++)
    System.out.print(list[i] + " ");
  }

  //Partitioning the list
  public static int parition(int[] list) {
    int first = 0;
    int last = list.length - 1;
    int pivot = list[first];
    int low = first + 1;
    int high = last;


    //creating the requirements for the list 
    while (high > low) {
      while ( low <= high && list[low] <= pivot)
        low++;

      while (low <= high && list[high] > pivot)
        high--;

      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }
    
    //creating requirements for the list with pivot
    while (high > first && list[high] >= pivot)
      high--;

    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    }
    else {
      return first;
    }
  }
}