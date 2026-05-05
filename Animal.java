/* 
Name: Layla Jenkins
Date: 05/05/2026
Assignment: 5.4 Performance Assessment_Inheritance & Overriding

Animal class.
This is the superclass that provides the generic information
that can be shared by all classes that inherit from it. It provides the 
name and number legs it has. It also has the constructor to initialize
the properties and getter and setter methods to get and modify them. */

public class Animal {
    //class properties
    private String Name;
    private int Legs;
    //constructor, set's the class's properties 
    public Animal(String name, int legs) {
        Name = name;
        Legs = legs;
    }
    //public get and set methods to provide access to
    //private properties
    public String getName() {
        return Name;
    }
    public int getLegs() {
        return Legs;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setLegs(int legs) {
        Legs = legs;
    }
    //function to print the animal's information
    public void printAnimal() {
        System.out.printf("The animal's name is %s and it has %d legs.%n", Name, Legs);
    }
}
