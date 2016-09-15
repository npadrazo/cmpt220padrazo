/**
 * file: Prob4-25.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem4.25 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 4.25
 */ 

public class prob425 {
	public static void main(String[] args) {

		//Creating a new string with the results from the math 
		StringBuilder s = new StringBuilder();

		//Creating a loop to pick a character
		for (int i = 0; i < 3; i++) {
			char ch = (char)(Math.random() * 26 + 'A');
			s.append(ch);
		}

		//Creating a loop to pick a number 
		for (int i = 0; i < 4; i++) {
			char number = (char)(Math.random() * 10 + '0');
			s.append(number);
		}

		//Giving the user the results 
		System.out.println("Random vehicle plate number is " + s);
		

	}
}