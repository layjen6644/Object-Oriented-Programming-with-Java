/*
Name: Layla Jenkins
Date: 05/05/2026
Assignment: 5.4 Performance Assessment_Inheritance & Overriding

Cat class.
This is the sub class that provides specific information for a cat. 
In this case, the specific information we want is the sound it makes.*/

public class Cat extends Animal {
    //class properties
    private String Sound;
    //Constructor with the parameters for name, legs, and sound. 
    //We will use "super" to call the superclass's constructors
    public Cat(String name, int legs, String sound) {
        super(name, legs);
        Sound = sound;
    }
    //functions to set and get class properties
    public String getSound() {
        return Sound;
    }
    public void setSound(String sound) {
        Sound = sound;
    }
    //function to print the Cat's information, overriding
    //superclass's "printAnimal" function
    @Override
    public void printAnimal() {
        //prints cat's information by using the superclass
        //function to print inherited information
        System.out.printf("The cat's name is %s. It has %d legs. The sound it makes is %s%n", getName(), getLegs(), Sound);
    }
}
