/**
 * file: Prob513.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.3
 * 
 * This file contains problem 05_13
 */

public class prob513 {
	public static void main(String[] args) {

		//etablishing variables
		int i = 0;


        //creating while loop
		while (i * i * i <= 12000) {
		i++;
		}
    
        //returning answer to user
		System.out.println(" The largest integer is " + i);
	}
}