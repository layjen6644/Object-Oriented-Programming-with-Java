/*
Name: Layla Jenkins
Date: 05/05/2026
Assignment: 5.4 Performance Assessment_Extending & Overriding

Main application (program) class.
In this application, we will demonstrate creating instances for the superclass Animal and subclass Cat
and passing values through their constructors. We will display each object by calling
their printAnimal() methods.  */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Layla Jenkins - Week 5 PA Inheritance & Overriding");
        System.out.println();
        //Instantiate Animal and Cat objects
        Animal a = new Animal("Sally", 4);
        Cat c = new Cat("Jeff", 2, "meow");
        //print each object's properties
        a.printAnimal();
        c.printAnimal();
        //update objects' properties
        a.setName("Ralph");
        a.setLegs(8);
        c.setSound("Ruff");
        c.setName("Barb");
        c.setLegs(10);
        //print new properties
        a.printAnimal();
        c.printAnimal();  
    }
}
