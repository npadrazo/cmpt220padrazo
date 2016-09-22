/**
 * file: Driverlab3.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.3
 * 
 * This file contains problem kattis problem determining distance
 */

import java.util.Scanner;

public class Driverlab3 {
  public static void main (String[] args) {

    //creating new scanner, establishing variables
    Scanner input = new Scanner(System.in);
    double x1, y1, x2, y2, p;
    double res; 

    while (input.hasNext()) {
      x1 = input.nextDouble();
      if (x1 == 0)
        break;
      y1 = input.nextDouble();
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      p = input.nextDouble();

      
    //returing result 
    res = Math.pow(Math.pow(Math.abs(x1 - x2), p) + 
        Math.pow(Math.abs(y1 - y2), p), 1/p);
    System.out.printf("%.10f\n", res);
    
    }
  }
}
