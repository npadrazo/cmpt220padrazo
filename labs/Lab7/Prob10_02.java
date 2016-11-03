/**
 * file: Pro10_02.java
 * author: nicole padrazo
 * course: CMPT 220
 * assignment: lab 7
 * due date: october 27, 2016
 * version: 1.3
 * 
 * This file contains problem 10 - 2. 
 */

public class Prob10_02 {
  public static void main(String[] args) {

  	//bmi output for person 1 and person 2
    BMI bmi1 = new BMI("Person 1", 20, 120, 5, 10);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Person 2", 19, 140, 5, 10);
    System.out.println("The BMI for " + bmi2.getName() + " is " 
      + bmi2.getBMI() + " " + bmi2.getStatus());
  }

  // creating BMI class 
  static class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    
    // public bmi class
    public BMI(String name, int age, double weight, double feet, double inches) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = feet * 12 + inches;
    }

    // public bmi class
    public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

    //public bmi class 
    public BMI(String name, double weight, double height) {
      this(name, 20, weight, height);
    }
 
    //calculating bmi
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND / 
        ((height * METERS_PER_INCH) *  (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
    }

    // the if statement returning the result to user 
    public String getStatus() {
      double bmi = getBMI();
      if (bmi < 18.5)
        return "Underweight";
      else if (bmi < 25)
        return "Normal";
      else if (bmi < 30)
        return "Overweight";
      else 
        return "Obese";
    }

    // returning name 
    public String getName() {
      return name;
    }

    // returning age 
    public int getAge() {
      return age;
    }

    // returning weight
    public double getWeight() {
      return weight;
    
    // returning height
    public double getHeight() {
      return height;
    }
  }
}