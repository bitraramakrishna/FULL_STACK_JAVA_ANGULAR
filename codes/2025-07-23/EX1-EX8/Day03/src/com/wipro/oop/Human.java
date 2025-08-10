package com.wipro.oop;

public class Human extends Animal{
	private String occupation;

    public Human(String name, int age, String occupation) {
        super(name, age);
        this.occupation = occupation;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Hello!");
    }

    @Override
    public String toString() {
        return "Human [" + super.toString() + ", Occupation: " + occupation + "]";
    }
}
