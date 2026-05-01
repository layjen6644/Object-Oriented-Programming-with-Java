/*
Name: Layla Jenkins
Date: 05/01/2026
Assignment: 4.6 Performance Assessment_Account Balance Calculators

Main application (program) class.
In this application, I'll demonstrate user-defined exception for exception handling.
For example, if the user enters an input that isn't a number or if the balance goes negative */
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
        //Demonstrate generating an exception when balance goes negative
        public static double negBalance(double balance, double transaction) throws Exception {
            if (balance + transaction < 0) {
                throw new Exception("Transaction would result in negative balance.");
            }
            return balance + transaction;
        }

        public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 4 PA - Account Balance Calculations");
        System.out.println();
        
        //create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        boolean cont = true; //loop control variable
        double balance = 0.0; //initiliazing balance to zero
        //asks user to balance
        System.out.print("Enter your current account balance: ");
                balance = scanner.nextDouble();
        //Loop for credit/debit transactions
        do {
            try {
                System.out.print("Enter a credit or debit for the account: ");
                double transaction = scanner.nextDouble();
                if (balance + transaction < 0) {
                    throw new Exception("Transaction would result in negative balance.");
                }  
                if (transaction == 0) {
                    System.out.println("Exiting calculator.");
                     cont = false;
                } else {          
                balance += transaction;
                System.out.printf("New balance: $%.2f%n", balance);
                } 
            } catch (InputMismatchException e) {
                //print the exception that was caught
                System.err.printf("%nException: %s%n", e);
                //discard the input so the user can try again
                scanner.nextLine();
                System.out.println("Must enter valid integers. Please try again.");
            } catch (Exception e) {   
                //print exception that was caught
                System.err.printf("%nUser-Generated Exception: %s%n", e);
                scanner.nextLine(); // Clear the invalid input
                System.out.printf("Please try again.%n", e);           
            } 
        } while (cont);

    }
}
