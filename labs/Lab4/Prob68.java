/**
 * file: Prob68.java
 * author: Nicole Padrazo 
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.3
 * 
 * This file contains problem )06_08
 */

public class Prob68 {
  public static void main(String[] args) {


    // creating the formatting for the table and the loop
    System.out.format("Celsius  Farenheit  |   Fareheit  Celcius"); 
    for (double cel = 40.0, far = 120; cel > 30.0; cel -= 1, far -=10) {
      System.out.format("%8.1f  %8.1f |  %8.1f  %8.1f",
       cel, Cel2Far(cel), far, Far2Cel(far));
    }

  }
  //creating the method to do converstions 
  public static double Cel2Far(double cel) {
    return (9.0)/5.0 * (cel + 32.0);
  }

  //creating method to do converstions
  public static double Far2Cel(double far) {
    return (5.0/9.0) * (far - 32.0);
  }
}