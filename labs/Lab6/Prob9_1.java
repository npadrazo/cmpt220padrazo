/**
 * file: prob9_1.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: lab 6
 * due date: october 20, 2016
 * version: 1.3
 * 
 * This file contains Problem 9.1
 */
public class Prob9_1 {
  public static void main(String[] args) {


    //creating objects 
    MyRectangle[] rectangles = new MyRectangle[2];
    rectangles[0] = new MyRectangle(4, 40);
    rectangles[1] = new MyRectangle(3.5, 35.9);

    //printing the result
    for (int i = 0; i < 2; i++) {
      System.out.println("MyRectangle " + (i+1) + ":");
      System.out.println("Area: " + rectangles[i].getArea());
      System.out.println("Perimeter: " + rectangles[i].getPerimeter());
    }
  }
}