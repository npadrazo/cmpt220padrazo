/**
 * file: Location.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 6
 * due date: October 20, 2016
 * version: 1.3
 * 
 * This file contains the location class for problem 9_13. 
 */

public class Location {
  
  //declaring the variables 
  public int row;
  public int column;
  public double maxValue;


  //creating location method 
  public Location(int row, int column, double maxValue) {

    //declaring variables
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }

  //creating location method 
  public static Location locateLargest(double[][] b) {


    //declaring variables
    int row = 0;
    int column = 0; 
    double maxValue = b[row][column];


    //creating array for max and min values 
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        if (maxValue < b[i][j]) {
            maxValue = b[i][j];
            row = i; 
            column = j;
        }
      }
    }

    return new Location(row, column, maxValue);
  }
}