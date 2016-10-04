/**
 * file: Driver_Project1.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Project 1
 * due date: October 4, 2016
 * version: 1.3
 * 
 * This file contains Project 1.
 */

import java.util.Scanner;

public class Driver_Project1 {
  public static void main(String[] args) {

    //initilizing the vectors 
  	int vecsize1  = 0;
  	int vecsize2 = 0; 

    //importing scanner
  	Scanner input = new Scanner(System.in);


    //importing vector
  	vecsize1 = input.nextInt();
  	vecsize2 = input.nextInt();


    //creating vectors
  	double[] number1 = new double[vecsize1];
  	double[] number2 = new double[vecsize2];



    //creating for loop for vector
  	for (int i = 0; i < vecsize1; i++) {
      number1[i] = input.nextDouble(); 
  	}

    //creating for loop for vector 
    for (int j = 0; j < vecsize2; j++) {
      number2[j] = input.nextDouble();
    }  

    //returning result to user
    double[] result = convolve(number1, number2);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }  
  }

  //creating new method 
  public static double[] convolve(double[] number1, double[] number2) {

    //initinlizing formula for convolution 
    int resultLength = (number1.length + number2.length) - 1;
    double[] result = new double[resultLength];


    //creating for loop for convolution 
    for (int ridx = 0; ridx < result.length; ridx++) {
      result[ridx] = 0;
      for (int sidx = 0; sidx < number2.length; sidx++) {
        if (((ridx - sidx) >= 0) && ((ridx - sidx) < number2.length))
          result[ridx] += number1[ridx - sidx] * number2[sidx];

      } 
    } 

    //returning the result 
    return result;
  }
}