/**
 * file: Prob57.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.3
 * 
 * This file contains problem 05_07
 */

public class prob57 { 
	public static void main(String[] args) {

		//establishing variable
		double tuition = 10000;
		int year = 0;


        //creating for loop
		int i;
		for (i = 0; i < 4; i++) {
			tuition = tuition * 1.05;
			year++;
			System.out.println("Year " + year + " is " + tuition);
		}
		
		//retuning result to user
		System.out.println(year + " years");	
		
	}
}