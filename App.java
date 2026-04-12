/* 
Name: Layla Jenkins
Date: 04/12/2026
Assignment: Week 1 - Lab Project

This is the first portion of my project for the 
lab assignment. I'll include a welcome message and
instructions for the user. It will also include some 
beginner functions for calculating values */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 1 Lab Project");
        System.out.println();
        System.out.println("Dear Math, I'm not a therapist. Solve your own problems.");
        System.out.println();
        System.out.println("This is a math calculator to solve your problems so you don't have to.");
        System.out.println();
        //Creates calculator object
        Calculator calculator = new Calculator();
        //Calls methods for addition and subtraction
        calculator.add();
        calculator.subtract();
        //End of program
        System.out.println("End of program. Remember: It's ok not to have all the answers!");
    }
}
