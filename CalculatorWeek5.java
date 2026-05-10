/*
Name: Layla Jenkins
Date: 05/10/2026
//Assignment: Week 5 - Lab Project

Calculator class. 
This class will house the menu options, instructions, and calculations.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class CalculatorWeek5 {
    private ArrayList<Double> memoryList = new ArrayList<>(); 
    private Scanner input;

    //Constructor for Scanner
    public CalculatorWeek5() {
        input = new Scanner(System.in);
    }   
    //Main menu
    public void menu() {
        //Initializaing choice variable to start at 0
        int choice = 0;
        //while loop to let menu run until user selects to exit
        while (choice != 6) {
            System.out.println("Please select an option: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Memory List (10 values max)");
            System.out.println("6. Exit");
            //exception to catch if user enters a letter or symbol
            try {
            //Stores users choice
            choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); //clears input error
            }
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
                    memoryList(); 
                    break;
                case 6:
                    System.out.println("Exiting the calculator."); //will bring back to main class and end program
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");  //Error if user enters a number outside of 1-5
            }
        }
    }

    //Helper method to ask the user how many numbers they want to enter, which will put it into an array
    public double[] getNumbers() {
        //declaring and intializing to zero
        int count = 0;
        //exception handling if user enters invalid input
        try {
            System.out.println("How many numbers do you want to enter into the calculator?");
            count = input.nextInt(); 
            //if user enters a zero or less than 
            if (count <=0) {
                System.out.println("You must enter at least 1 number");
                return new double[0]; //ensures array is empty
            }
        } catch (InputMismatchException e) {
            System.err.printf("%nException: %s%n", e);
            input.nextLine(); //clears input
            System.out.printf("Please enter a number: %n");
            return new double[0]; //ensure array is empty
        }
        //declaring array that is the size of the value that is stored in the variable "count"
        double[] numbers = new double[count];
        //loop for the user to enter numbers to fill array
        for (int i = 0; i < count; i++) {
            //exception handling for invalid input
            try {
                System.out.println("Enter number " + (i + 1) + ":");
                numbers[i] = input.nextDouble();
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                input.nextLine(); //clears input
                i--; // retries in same array
            }
        }
        return numbers;
    } 
    
    //Method for addition
    public void add() {
        System.out.println();
        //calls helper method
        double[] values = getNumbers(); 
        //declaring and initializing to zero
        double sum = values[0];
        //prints first number in array
        System.out.print(values[0]);
        //loop to add numbers
        for (int i = 1; i < values.length; i++) {
            System.out.print(" + " + values[i]);
            sum += values[i];
        }    
        //prints results
        System.out.printf(" = %.2f%n", sum);
        //calls memory method
        storeValues(sum);
    }

    //Method for subtraction
    public void subtract() {
        System.out.println();
        //calls helper method
        double[] values = getNumbers();
        //declaring and initializing
        double difference = values[0];
        //prints first number in array
        System.out.print(values[0]);
        //loop to subtract numers
        for (int i = 1; i < values.length; i++) {
            System.out.print(" - " + values[i]);
            difference -= values[i];
        }
        //prints results
        System.out.printf(" = %.2f%n", difference);
        //calls memory method
        storeValues(difference);      
    }

    //Method for multiplication    
  public void multiply() {
        System.out.println();
        //calls helper method
        double[] values = getNumbers();
        //declaring and initializing
        double product = values[0];
         //prints first number in array
         System.out.print(values[0]);
        //loop to multiple
        for (int i = 1; i < values.length; i++) {
        System.out.print(" * " + values[i]);
        product *= values[i];
        }
        //prints results
        System.out.printf(" = %.2f%n",  product);
        //calls memory method
        storeValues(product);
    }


    //Method for division
    public void divide() {
        System.out.println();
        //calls helper method
        double[] values = getNumbers();
        //declaring and initializing
        double quotient = values[0];
        //printing first number in array
        System.out.print(values[0]);
        //loop to divide numbers
        for (int i = 1; i < values.length; i++) {
            //if dividing by zero
            if (values[i] == 0) {
                continue;
            }
            System.out.print(" / " + values[i]);
            quotient /= values[i];
        }
        System.out.printf(" = %.2f%n", quotient);
        System.out.println("Dividing by zero? That's a boundary even therapy can't fix.");
        System.out.println("I ignored that number and moved on");
        
        storeValues(quotient);
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
}

