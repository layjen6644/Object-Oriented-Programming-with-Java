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

    //Method for addition
    public void add() {
        System.out.println("Please enter two integers separated by a space to add them together: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        //Displays results
        System.out.printf("%d + %d = %d%n", num1, num2, sum);   
        System.out.println();
    }

    //Method for subtraction
    public void subtract() {
        System.out.println("Please enter two floating-point values separated by a space to subtract them: ");
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double difference = num3 - num4;
        //Displays results
        System.out.printf("%.2f - %.2f = %.2f%n", num3, num4, difference);  
        System.out.println(); 
    }
    
    
}
