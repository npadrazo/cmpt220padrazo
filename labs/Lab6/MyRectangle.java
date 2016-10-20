/**
 * file: MyRectangle.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 6
 * due date: October 20, 2016
 * version: 1.3
 * 
 * This file contains the rectangle class for problem 9_1.
 */

public class MyRectangle {


  //declaring private variables
  private double width;
  private double height;


  //creating constructor 
  public MyRectangle() {
    this.width = 1.0;
    this.height = 1.0;
  }


  //creating constructor 
  public MyRectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  //getting area of rectangle 
  public double getArea() {
    return this.width * this.height;
  }

  //getting perimeter of rectangle 
  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }
}