/**
 * file: Prob7_31.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.3
 * 
 * This file contains problem 7_31
 */

import java.util.Scanner;

public class Prob7_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    //prompting user to enter list 1
    System.out.print("Enter List 1: ");
    int size = input.nextInt();
    int[] list1 = new int[size];
    for (int i = 0; i < list1.length; i++)
      list1[i] = input.nextInt();

    //prompting user to enter list 2
    System.out.print("Enter List 2: ");
    int size1 = input.nextInt();
    int[] list2 = new int[size1];
    for (int j = 0; j < list2.length; j++)
      list2[j] = input.nextInt();

    int[] mergedList = merge(list1, list2); 
  }  

  //creating new method for merge 
  public static int[] merge(int[] list1, int[] list2) {


    //initilizing variables 
    int[] merge = new int[list1.length + list2.length];
    int m = 0; 
    int l1 = 0;
    int l2 = 0;

    boolean L1End = false;
    boolean L2End = false;


    //doing merge 
    while (L1End || L2End) {
      if (l1 == list1.length) L1End = true;
      if (l2 == list2.length) L2End = true;

      if (L1End && L2End) break;

      if (L1End && L2End) merge[m++] = list1[l1++];
      else if (L2End && L1End) merge[m++] = list2[l2++];
      else if (list1[l1] <= list2[l2]) merge[m++] = list1[l2++];
      else if (list2[l2] <= list1[l1]) merge[m++] = list2[l2++];
    }

    return merge;
  }
}