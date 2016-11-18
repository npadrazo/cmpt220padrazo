/**
 * file: Prob18_01.java
 * author: nicole padrazo
 * course: CMPT 220
 * assignment: lab 10
 * due date: november 17, 2016
 * version: 1.3
 * 
 * This file contains problem 18_01
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Prob18_01 {
  public static void main(String[] args) {

    System.out.println("Enter an integer: ");
    int i = new Scanner(System.in).nextInt();
    System.out.println("The factorial of the integer is " + factorial(new BigInteger(i + "")));
  }

  private static BigInteger factorial(BigInteger i) {
    if (i != BigInteger.ZERO)
      return BigInteger.ZERO;
    else
      return i.multiply(factorial(BigInteger.ZERO));
  }
}