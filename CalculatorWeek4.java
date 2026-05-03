/*
Name: Layla Jenkins
Date: 05/03/2026
//Assignment: Week 4 - Lab Project

Calculator class. 
This class will house the menu options, instructions, and calculations.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class CalculatorWeek3 {
    private ArrayList<Double> memoryList = new ArrayList<>(); 
    private Scanner input;

    //Constructor for Scanner
    public CalculatorWeek3() {
        input = new Scanner(System.in);
    }   
    //Main menu
    public void menu() {
        //Initializaing choice variable to start at 0
        int choice = 0;
        //while loop to let menu run until user selects to exit
        while (choice != 7) {
            System.out.println("Please select an option: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Store a Single Memory Value");
            System.out.println("6. Memory List (10 values max)");
            System.out.println("7. Exit");
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
                    singleMemory();
                    break;
                case 6:
                    memoryList(); 
                    break;
                case 7:
                    System.out.println("Exiting the calculator."); //will bring back to main class and end program
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");  //Error if user enters a number outside of 1-5
            }
        }
    }
    //Method for addition
    public void add() {
        System.out.println();
        boolean cont = true; //loop control variable
        System.out.println("Enter two numbers (separated by a space): ");
        do {
            try {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.printf("%d + %d = %d%n", num1, num2, sum);
                storeValues(sum); //calls method for array list 
                System.out.println();
                cont = false; //exits loop if successful 
            } catch (InputMismatchException e) {
                //prints exception that was caught
                System.err.printf("%nException: %s%n", e);
                System.out.println("You must enter two integers. Please try again.");
                input.nextLine(); //clears former input
                System.out.println("Please enter two new numbers (separated by a space): ");
            } 
        } while (cont);        
    }

    //Method for subtraction
    public void subtract() {
        System.out.println();
        boolean cont = true; //loop control variable
        System.out.println("Enter two numbers (separated by a space): ");
        do {
            try {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int difference = num1 - num2;
                System.out.printf("%d - %d = %d%n", num1, num2, difference);
                storeValues(difference); //calls method for array list
                System.out.println();
                cont = false; //exits loop if successful 
            } catch (InputMismatchException e) {
                //prints exception that was caught
                System.err.printf("%nException: %s%n", e);
                System.out.println("You must enter two integers. Please try again.");
                input.nextLine(); //clears former input
                System.out.println("Please enter two new numbers (separated by a space): ");
            } 
        } while (cont);
        
    }

    //Method for multiplication    
  public void multiply() {
    System.out.println();
    boolean cont = true; //loop control variable
    System.out.println("Enter two numbers (separated by a space): ");
    do {
        try {
           int num1 = input.nextInt();
            int num2 = input.nextInt();
            int product = num1 * num2;
            System.out.printf("%d * %d = %d%n", num1, num2, product);
            storeValues(product); //calls method for array list
            System.out.println(); 
            cont = false; //exits loop if successful 
        } catch (InputMismatchException e) {
                //prints exception that was caught
                System.err.printf("%nException: %s%n", e);
                System.out.println("You must enter two integers. Please try again.");
                input.nextLine(); //clears former input
                System.out.println("Please enter two new numbers (separated by a space): ");
            } 
        } while (cont);
    }

    //Method for division
    public void divide() {
        System.out.println();
        boolean cont = true; //loop control variable
        System.out.println("Enter two numbers (separated by a space): "); //I want this outside the loop
        do {  
            try {
                double num1 = input.nextDouble();
                double num2 = input.nextDouble();
            //if user attempts to divide by zero, exception is thrown
            if (num2 == 0) { 
               throw new ArithmeticException("Cannot divide by zero.");
            } 
        double quotient = num1 / num2;
        System.out.printf("%,.2f / %,.2f = %,.2f%n", num1, num2, quotient);
        storeValues(quotient); //calls method for array list
        cont = false; //exits loop if successful 
        System.out.println();
            } catch (ArithmeticException e) {
                System.err.printf("%nException: %s%n", e);
                System.out.println("Dividing by zero? That's a boundary even therapy can't fix.%n");
                input.nextLine(); //clears former input
                System.out.println("Please enter two new numbers (separated by a space): ");
            } catch (InputMismatchException e) {
                //prints exception that was caught
                System.err.printf("%nException: %s%n", e);
                System.out.println("You must enter two integers. Please try again.");
                input.nextLine(); //clears former input
                System.out.println("Please enter two new numbers (separated by a space): ");
            }
        } while (cont);
    }  

    //Method to store values in ArrayList
    public void storeValues(double result) {
        System.out.println();
        System.out.println("Should we store this result in memory or let it go? Select an option: ");
        System.out.println("1. Store in memory list (max 10 values)");
        System.out.println("2. Let it go (return to menu)");
        int choice = input.nextInt();
        //Switch to store values in array, will display after each math problem is executed to give
        //user the option to store the result in the memory list or not
        switch (choice) {
            case 1: 
                if (memoryList.size() < 10) {
                    memoryList.add(result);
                    System.out.println("Stored in memory list. Returning to main menu.");
                } else {
                    System.out.println("Memory list is full. Cannot store more values. Returning to main menu.");
                }
                return;
            case 2: 
                System.out.println("Letting it go. Returning to main menu.");
                return;
            default: 
                System.out.println("Invalid option. Returning to main menu.");
                return;
        }
    }

    //memoryList functions
    public void memoryList() {
        System.out.println();
        int choice = 0; //initiliazing choice to 0
        while (choice != 8) {
        System.out.println();
        System.out.println("Memory List Menu. Select an option: ");
        System.out.println("1. Display list.");
        System.out.println("2. Count of the values stored.");
        System.out.println("3. Remove a value from the list.");
        System.out.println("4. Add values if under 10 values stored.");
        System.out.println("5. Display the sum of the values stored.");
        System.out.println("6. Display the average of the values stored.");
        System.out.println("7. Display the difference of the first and last values stored.");
        System.out.println("8. Return to main menu.");
        choice = input.nextInt();
        //switch for memory list options, includes everything to run those options
        switch (choice) {
            case 1: 
                System.out.println("Values stored in memory:");
                //Displays header columns
                System.out.printf("%s%8s%n", "Index", "Value");
                //prints values in array
                for (int i = 0; i < memoryList.size(); i++) {
                    System.out.printf("%5d%8.2f%n", i, memoryList.get(i));
                }   
                break;
            case 2: 
                System.out.println("Count of values stored: " + memoryList.size());
                break;
            case 3:
                System.out.println("Enter the index of the value to remove: ");
                int indexToRemove = input.nextInt();
                if (indexToRemove >= 0 && indexToRemove < memoryList.size()) {
                    memoryList.remove(indexToRemove);
                    System.out.println("Value removed. Returning to menu.");
                } else {
                    System.out.println("Invalid index. Returning to menu.");
                }
                break;
            case 4:
                if (memoryList.size() < 10) {
                    System.out.println("Enter a value to add to the memory list: ");
                    double valueToAdd = input.nextDouble();
                    memoryList.add(valueToAdd);
                    System.out.println("Value added. Returning to menu.");
                } else {
                    System.out.println("Memory list is full. Cannot add more values. Returning to menu.");
                }
                break;
            case 5:
                double sum = 0; //Initializing to 0
                for (double value : memoryList) {
                    sum += value; //Adding each value in the list to sum
                }   
                System.out.printf("The sum of the values stored is %.2f%n", sum);
                break;
            case 6: 
                double average = 0; //Initializing to 0
                for (double value : memoryList) { //adding the values
                    average += value;
                }average /= memoryList.size(); //Dividing by the number of values to get the average
                System.out.printf("The average of the values stored is %.2f%n", average);
                break;
            case 7: 
                if (memoryList.size() > 1) {
                    double difference = memoryList.get(0) - memoryList.get(memoryList.size() - 1); //Subtracting the last value from the first value
                    System.out.printf("The difference of the first and last values stored is %.2f%n", difference);
                } else {
                    System.out.println("Not enough values stored. Need at least 2 values to calculate difference.");
                }
                break;
            case 8:
                System.out.println("Returning to main menu.");
                return;
            default:
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    //Method for single memory value
    public void singleMemory() {
        System.out.println();
        //initializing choice to start at 0
        int choice = 0;
        double value = 0; //Initializing value to 0
        while (choice != 5) {
            System.out.println("Single Memory Value Menu. Select an option: ");
            System.out.println("1. Store value.");
            System.out.println("2. Display value.");
            System.out.println("3. Clear memory.");
            System.out.println("4. Replace value.");
            System.out.println("5. Return to main menu.");
            choice = input.nextInt();
            //Switch for single memory  
            switch (choice) {
                case 1:
                    System.out.println("Enter a value to store in memory: ");
                    value = input.nextDouble();
                    System.out.println("Value stored.");
                    break;
                case 2:
                        System.out.printf("Value in memory: %.2f%n", value);
                    break;
               case 3: 
                    value = 0; // Clear the memory by setting it to 0
                    System.out.println("Memory cleared.");
                    break;
                case 4: 
                    System.out.println("Enter a new value to store in memory: ");
                    value = input.nextDouble();
                    System.out.println("Value replaced.");
                    break;
                 case 5:
                    System.out.println("Returning to main menu.");
                     return;
                default:
                    System.out.println("Invalid option. Please try again.");    
            }
        }
    }
}

