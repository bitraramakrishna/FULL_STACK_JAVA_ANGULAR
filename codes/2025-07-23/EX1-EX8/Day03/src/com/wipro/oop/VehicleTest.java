package com.wipro.oop;

/*import com.wipro.oop.Car;
import com.wipro.oop.Motorcycle;*/


public class VehicleTest {
	 public static void main(String[] args) {
	        System.out.println("Testing Method Overriding (Runtime Polymorphism) ");

	        
	        Vehicle myVehicle1 = new Car();
	        myVehicle1.start(); 

	  
	        Vehicle myVehicle2 = new Motorcycle();
	        myVehicle2.start(); 

	        
	        Vehicle genVehicle = new Vehicle();
	        genVehicle.start();
	    }
}
