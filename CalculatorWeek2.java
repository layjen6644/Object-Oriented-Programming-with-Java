/*
Name: Layla Jenkins
Date: 04/12/2026
//Assignment: Week 1 - Lab Project

Calculator class. 
This class will house the menu options, instructions, and calculations.*/

import java.util.Scanner;

public class Calculator {
    private Scanner input;

    //Constructor for Scanner
    public Calculator() {
        input = new Scanner(System.in);
    }   
    //Main menu
    public void menu() {
        //Initializaing choice variable to start at 0
        int choice = 0;
        //while loop to let menu run until user selects to exit
        while (choice != 5) {
            System.out.println("Please select an option: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            //Stores users choice
            choice = input.nextInt();
            //switch statement to call methods based on user input
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    System.out.println("Exiting the calculator."); //will bring back to main class and end program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");  //Error if user enters a number outside of 1-5
            }
        }
    }
    //Method for addition
    public void add() {
        System.out.println();
        System.out.println("Enter two numbers (separated by a space): ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d%n", num1, num2, sum);
        System.out.println();
    }

    //Method for subtraction
    public void subtract() {
        System.out.println();
        System.out.println("Enter two numbers (separated by a space): ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int difference = num1 - num2;
        System.out.printf("%d - %d = %d%n", num1, num2, difference);
        System.out.println();
    }

    //Method for multiplication    
  public void multiply() {
    System.out.println();
        System.out.println("Enter two numbers (separated by a space): ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int product = num1 * num2;
        System.out.printf("%d * %d = %d%n", num1, num2, product);
        System.out.println();
    }

    //Method for division
    public void divide() {
        System.out.println();
        System.out.println("Enter two numbers (separated by a space): ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        //While loops that displays error message if user tries to divide by zero and asks them to try again
        while (num2 == 0) {  
            System.out.println("Dividing by zero? That's a boundary even therapy can't fix.");
            System.out.println("Try again: ");
            num2 = input.nextDouble(); //They only need to enter the 2nd number
        }
        double quotient = num1 / num2;
        System.out.printf("%,.2f / %,.2f = %,.2f%n", num1, num2, quotient);
        System.out.println();
    }  
}

