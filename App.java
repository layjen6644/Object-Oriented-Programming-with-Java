/* 
Name: Layla Jenkins
Date: 04/19/2026
Assignment: 2.5 Performance Assessment_Loops & Calculations

Main application (program) class.
This program will demonstrate two types of loops, counter controlled
and condition based loops. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 2 PA Loops & Calculations");
        System.out.println();

        //Demonstrate a counter-controlled loop
        System.out.println("Counter-Controlled loop:");
        System.out.println("Calculating the sum of integers 1-10:");
        //Initializing int (data type) sum (variable) to start at 0
        int sum = 0;
        //For loop to add numbers 1-10 together
        for (int cnt =1; cnt <= 10; cnt++) {
            sum += cnt;
            System.out.printf("Running total after " + cnt + " = " + sum + "\n");
        }
        System.out.printf("Final Total: %d%n", sum);
        System.out.println();
        //Demonstrate a condition-based loop
        System.out.println("Condition-based loop:");
        //Creat a scanner to get user input
        Scanner input = new Scanner(System.in);
        //Initializing runningTotal and countto start at 0
        int runningTotal = 0;
        int count = 0;
        int inVal;
        //Do..while loop to add user input together and count total entries
        do {
            System.out.println("Enter an integer value (-1 to quit): ");
            inVal = input.nextInt();

            if (inVal != -1) {
                runningTotal += inVal;
                count++;
                System.out.printf("Running total: %d%n", runningTotal);
            }
        } while (inVal != -1);
        
        System.out.printf("Final Total: %d%n", runningTotal);
        System.out.printf("The number of entries was: %d", count);
    }   
}
