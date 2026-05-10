/* 
Name: Layla Jenkins
Date: 05/10/2026
Assignment: Week 5 - Lab Project

This is the first portion of my project for the 
lab assignment. I'll include a welcome message and
instructions for the user. It will also include some 
beginner functions for calculating values */


public class AppWeek5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 5 Lab Project");
        System.out.println();
        System.out.println("Dear Math, I'm not a therapist. Solve your own problems.");
        System.out.println();
        System.out.println("This is a math calculator to solve your problems so you don't have to.");
        System.out.println();
        //Creates calculator object
        CalculatorWeek5 calculator = new CalculatorWeek5();
        //Calls menu method 
        calculator.menu();
                
        //End of program
        System.out.println("End of program. Remember: It's ok not to have all the answers!");
    }
}
