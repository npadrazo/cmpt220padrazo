/**
 * file: Prob4-10.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem3.4 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 34.10
 */ 


import java.util.Scanner; 

public class prob410 {
	public static void main (String[] args) {

		//First set of numbers 
		String set1 = 
		" 1  3  5  7\n" +
		" 9 11 13 15\n" +
		"17 19 21 23\n" +
		"25 27 29 31";

		//Second set of numbers 
		String set2 = 
		" 2  3  6  7\n" +
		"10 11 14 15\n" +
		"18 19 22 23\n" +
		"26 27 30 31";

		//Third set of numbers 
		String set3 =
		" 4  5  6  7\n" +
		"12 13 14 15\n" +
		"20 21 22 23\n" +
		"28 29 30 31";

		//Fourth set of numbers 
		String set4 = 
		" 8  9 10 11\n" +
		"12 13 14 15\n" +
		"24 25 26 27\n" +
		"28 29 30 31";

		//Fifth set of numbers 
		String set5 = 
		"16 17 18 19\n" +
		"20 21 22 23\n" +
		"24 25 26 27\n" +
		"28 29 30 31";

		int day = 0;

		//Creating a new scaner 
		Scanner input = new Scanner(System.in);

		//Asking the user about their birthday 
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		int answer = input.nextInt(); 

		//Receiving answer
		if (answer == 1)
			day += 1; 

		//Prompting for second set of birthdays 
		System.out.print("\nIs your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();

		//Receiving answer 
		if (answer == 1)
			day += 2;
		//Prompting user for third set of birthdays 
		System.out.print("Is your birthday in Set3\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes");
		answer = input.nextInt(); 

		//Receiving answer 
		if (answer == 1)
			day += 4;

		//Prmpting user for fourth set of birthdays 
		System.out.print("\nIs your birthday in Set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();

		//Receiving answer 
		if (answer == 1)
			day +=8; 

		//Prompting user about fifth set of birthdays 
		System.out.println("\nIs your birthday in Set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt(); 

		//Receieving Answer 
		if (answer ==1)
			day += 16;

		//Retuning answer to user 
		System.out.println("\nYour birthday is " + day + "!");
		 
	}
}