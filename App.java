/*
Name: Layla Jenkins
Date: 04/23/2026
Assignment: 3.5 Performance Assessment_Calculations & Unique Numbers

Main application (program) class.
In this application, we will demonstrate the use of array and ArrayList objects 
and using methods to make calculations of elements in the array and ArrayList. 
*/
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 3 PA - Calculations & Unique Numbers");
        System.out.println();

        //Declare a scanner to get user input
        Scanner input = new Scanner(System.in);

        //Ask the user for 10 integers
        System.out.println("Enter 10 integers to find the sum: ");
        //create an array to hold the 10 integers
        int[] integersArr = new int[10];
        //loop 10 times to get the integers from the user and store them in the array
        for (int i = 0; i < integersArr.length; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            integersArr[i] = input.nextInt();
        }   

        //Call method to calculate the sum of the integers in the array
        int sumArr = sumArray(integersArr);
        //Displays the size of the array
        System.out.printf("The number of integers you entered is: %d%n", integersArr.length);
        //display the sum to the user
        System.out.printf("The sum of the integers you entered is: %d%n", sumArr);
        //Displays the average of the array
        double averageArr = (double) sumArr/integersArr.length;
        System.out.printf("The average of the integers you entered is: %.2f%n", averageArr);
        
        //Getting unique (numbers) integers for an ArrayList, using overload of getUniqueNumbers that doesn't require a count of integers to be entered
        System.out.println();
        System.out.println("Enter integers to find the unique numbers (enter -1 to stop): ");
        //create an ArrayList to hold the integers
        ArrayList<Integer> uniqueNumbers = getUniqueList();
        int sum = sumArrayList(uniqueNumbers);
        //Displays the size of ArrayList
        System.out.printf("The number of unique integers you entered is: %d%n", uniqueNumbers.size());
        //display the sum to the user
        System.out.printf("The sum of the integers you entered is: %d%n", sum);
        //Displays the average of the ArrayList
        double average = (double) sum/uniqueNumbers.size();
        System.out.printf("The average of the integers you entered is: %.2f%n", average);
    }

      //Method to calculate the sum of integers in an array
    public static int sumArray(int[] arr) {
        int sum = 0;  //Initializing sum to 0
        //loop through the array and add each integer to the sum
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //Overload function and method to get unique numbers from the user and return an ArrayList
    public static ArrayList<Integer> getUniqueList() {
        //declare a scanner to get user input
        Scanner input = new Scanner(System.in);

        //create an ArrayList to hold the unique numbers
        ArrayList<Integer> uniqueList = new ArrayList<>();
        //declares integer variable 
        int number;

        //loop to get integers from the user until they enter -1 to stop
        do {
            System.out.print("Enter an integer (or -1 to stop): ");
            number = input.nextInt();
            //if the number is not already in the ArrayList, add it (contains)
            if (number != -1) {
                if (!uniqueList.contains(number)) {
                    uniqueList.add(number);
                }
            }
        } while (number != -1);  //Will continue until user enters -1 to stop
        return uniqueList;
    }

    //Overload function to calculate sum of ArrayList
    public static int sumArrayList(ArrayList<Integer> list) {
        int sum = 0;  //Initializing sum to 0
        //loop through the ArrayList and add each integer to the sum
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
