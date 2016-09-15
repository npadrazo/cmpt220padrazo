
/**
 * file: Prob38.java
 * author: Nicole Padrazo
 * course: CMPT 220
 * assignment: Problem3.4 
 * due date: September 14, 2016
 * version 1.8
 *
 * This file contaions problem 3.8
 */ 
public class prob38{
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//prompting user for three numbers 
		System.out.print("Enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		//If statements for the reults 
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		//if statements for the result 
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}

		//if statements for the result 
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		//returning the answer for the user 
		System.out.println("The numbers are " 
			+ num1 + " " + num2 + " " + num3); 
	}
}