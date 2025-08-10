package com.wipro.oop;

public abstract class Animal {
	private String name;
	private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

}
