package com.wipro.oop;
import com.wipro.oop.Human;
import com.wipro.oop.Bird;
import com.wipro.oop.Dog;
public class AnimalTest {
	
	 public static void main(String[] args) {
	       

	        Human ram = new Human("ram", 22, "Developer");
	        System.out.println(ram);
	        ram.makeSound();
	        ram.eat();

	        Bird polly = new Bird("parrot", 2, 30.0);
	        System.out.println(polly);
	        polly.makeSound();
	        polly.eat();

	        Dog buddy = new Dog("Buddy", 5, "r");
	        System.out.println(buddy);
	        buddy.makeSound();
	        buddy.eat();
	    }

}
