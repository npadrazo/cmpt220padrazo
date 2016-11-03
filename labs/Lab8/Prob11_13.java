/**
 * file: Prob11_13.java
 * student name: nicole padrazo
 * course: CMPT 220
 * assignment: lab8
 * due date: november 3, 2016
 * version: 1.3
 * 
 * This file contains problem 11_13. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prob11_13 {
  public static void main(String[] args) {

    //prompting the user to enter 10 integers
    System.out.println("Enter 10 integers: ");
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    //creating array, populating array with numbers entered above
    for (int i = 0; i < 10; i++) list.add(input.nextInt()); 

     //removing duplicates, printing list 
     removeDuplicate(list);
     System.out.println(list);
    }

  public static void removeDuplicate(ArrayList<Integer> list) {

    //creating array list 
    ArrayList<Integer> temp = new ArrayList<>();
    for(int i = 0; i < list.size(); i++) {
      if (!temp.contains(list.get(i))) {
        temp.add(list.get(i));
     }
    }

     // getting list 
     list.clear();
     list.addAll(temp);
  }
}



