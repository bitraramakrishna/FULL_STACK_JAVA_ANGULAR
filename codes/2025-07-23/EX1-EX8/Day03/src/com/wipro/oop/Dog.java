package com.wipro.oop;

public class Dog extends Animal {
	private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: bow bow");
    }

   // @Override
    public String toString() {
        return "Dog [" + super.toString() + ", Breed: " + breed + "]";
    }
	

}
