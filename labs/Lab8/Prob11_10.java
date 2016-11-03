/**
 * file: Prob11_10.java
 * author: Nicole Padrazo 
 * course: CMPT 220
 * assignment: Lab 8
 * due date: November 3, 2016
 * version: 1.3
 * 
 * This file contains problem 11_10
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Prob11_10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //prompting user to enter 5 strings 
    System.out.print("Enter 5 strings: ");
    MyStack stack = new MyStack();

    //creeating array for stack 
    for (int i = 0; i < 5; i++)
      stack.push(input.nextLine());

    //returning the answer to user, making sure its not empty 
    System.out.println(stack.getSize() + " strings are: ");
    while(!stack.isEmpty())
      System.out.print(stack.pop());
  }
}

//creating stack method, importing java array function 
class MyStack extends java.util.ArrayList<Object> {
  public boolean isEmpty() {
    return super.isEmpty();
  }

  //ordering strings 
  public int getSize() {
    return size();
  }

  public Object peek() {
    return get(getSize() - 1);
  }

  public Object pop() {
    return remove(getSize() - 1);
  }

  public Object push(Object o) {
    add(o);
    return o;
  }

  public int search(Object o) {
    return indexOf(o);
  }

  public String toString() {
    return "stack: " + toString();
  }
}
