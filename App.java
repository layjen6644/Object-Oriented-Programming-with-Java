/* 
Name: Layla Jenkins
Date: 04/11/2026
Assignment: 1.8 Performance Assessment_Classes, Objects, Methods, and strings

Main class.

This class will demonstrate the use of constructors, getters,
setters, and objects through the Employee class. This will create
Employee objects, display their initials, update their data, and print updated
data.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 1 PA Classes.");
        System.out.println();

        //Creating 2 instances for Employee class
        Employee emp1 = new Employee("John","Smith",  5000.00);
        Employee emp2 = new Employee( "Susan", "Brown",  500.00);

        //Displaying salaray for each employee
        System.out.printf("Employee Monthly Salaries: ");
        System.out.printf("%n%s %s: $%.2f%n",
            emp1.getfirstName(), emp1.getlastName(), emp1.getSalary()); 
        System.out.printf("%s %s: $%.2f%n",
            emp2.getfirstName(), emp2.getlastName(), emp2.getSalary()); 

        //Creating a scanner to get input from the user
        Scanner input = new Scanner(System.in);

        //Update last name of employee 1
        System.out.println();
        System.out.print("Enter a new last name for employee 1: ");
        String lastName = input.nextLine();

        //Update first name of employee 2
        System.out.print("Enter a new first name for employee 2: ");
        String firstName = input.nextLine();

        //Update the employee objects with the new names
        emp1.setlastName(lastName);
        emp2.setfirstName(firstName);

        //Update salaries for each employee
        System.out.print("Enter a new monthly salary for employee 1: $");
        double salary = input.nextDouble();
        emp1.setSalary(salary);

        System.out.print("Enter a new monthly salary for employee 2: $");
        salary = input.nextDouble();
        emp2.setSalary(salary);

        //Display the updated employee data
        System.out.printf("%nUpdated Employee Information: ");
        System.out.printf("%n%s %s: $%.2f%n",
            emp1.getfirstName(), emp1.getlastName(), emp1.getSalary());
        System.out.printf("%s %s: $%.2f%n",
            emp2.getfirstName(), emp2.getlastName(), emp2.getSalary()); 
    }
}
