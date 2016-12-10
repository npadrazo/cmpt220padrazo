// This is a java code that allows a user to input his or her 
// salary for the year after taxes and returns 
// information to the user. The information returned ranges 
// from how much money he or she should save weekly to how 
// much he or she could have thirty years from the day they 
// input the salary.

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;


public class FinanceCalc {
  private static DecimalFormat df2 = new DecimalFormat(".##");
  public static void main(String[] args) {

    // the while statement to run the program 
    while(true) {
      try {

        Scanner input = new Scanner(System.in);
        while (true) {
          // prompting the user for an input
          System.out.println("Enter your yearly income after tax: ");
          double salary = input.nextDouble();
          double weekly = salary / 52;
          double retire = weekly * .10; 
          double yearly = retire * 52;
          double thirty = yearly * 30; 

          // making sure the input it positive 
          if (salary > 0) {

            // if statement for the percent the user should save 
            if (salary < 50000) {
              System.out.println("Save .5% weekly");
            } else if (salary <= 75000) {
              System.out.println("Save 1% weekly");
            } else {
              System.out.println("Save 1.5% weekly");
            } 

              // returning calculations 
              System.out.println("Your weekly salary is: $" + 
                df2.format(weekly)); 
              System.out.println("You should put $" + 
                df2.format(retire) + 
              " in an account each week.");
              System.out.println("You should put $" + 
                df2.format(yearly) + 
              " away each year.");
              System.out.println("The average time to start saving" 
              + " is thirty years before you plan to retire." 
              + " You will have $" + df2.format(thirty) +
              " thirty years from today.");
              return;
            //  prompting the user to enter a positive number 
            } else {
              System.out.println("Please enter a positive integer.");
          } 
        }  
        // prompting the user to enter a number 
      } catch (Exception e) {
          System.out.println("Please enter an integer.");
      }    
    }
  } 
} 