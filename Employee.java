/*
Name: Layla Jenkins
Date: 04/11/2026
Assignment: 1.8 Performance Assessment_Classes, Objects, Methods, and strings

Employee class.
This class represents an employee with a name and salary. A getter and setter
are provided for the name property; a getter is provided for the salary along with a 
method to give a raise to the salary.
*/

public class Employee {
    //Class properties (instance variables)
    private String firstName;
    private String lastName;
    private double mSalary;

    //Constructor takes 2 parameters to set the instance variables
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Validate the salary provided - if it is greater than 0,
        //set the instance variable to the value provided; otherwise
        //leave the intance variable as the dafault 0.0
        if (salary >= 1000.0) {
            mSalary = salary;      
        }
    }

    //Getter and setter for FirstName variable (property)
    public String getfirstName() {
        return firstName;           
    }
    public String getlastName() {
        return lastName;           
    }   
    public double getSalary() {
        return mSalary;           
    }   

    public void setfirstName(String firstName) {
        this.firstName = firstName;           
    }   

    public void setlastName(String lastName) {
        this.lastName = lastName;           
    }

    //method to set monthly salary 
    public void setSalary(double salary) {
        if (salary >= 1000.0) {
            mSalary = salary;      
        }
        else {
            mSalary = 0.0;
        }
    }
}
