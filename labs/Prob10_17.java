/**
 * file: Prob10_17.java
 * author: nicole padrazo
 * course: CMPT 220
 * assignment: lab 7
 * due date: october 27, 2016
 * version: 1.3
 * 
 * This file contains problem 10 - 17
 */

import java.math.BigDecimal;

public class Prob10_17 {
  public static void main(String[] args) {

    // initilizing elements 
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal a = new BigDecimal(start);
    int count = 0;

    // comparing the values 
    while (count < 10) {
      BigDecimal squared = a.multiply(a);
      if (squared.compareTo(longMaxValue) > 0) {
        count ++;
        System.out.println(count+":" + a + " squared = " + squared);
      }
      a = a.add(BigDecimal.ONE);
    }
  }
}