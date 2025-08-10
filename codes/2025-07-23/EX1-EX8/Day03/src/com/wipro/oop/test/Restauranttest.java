package com.wipro.oop.test;
import com.wipro.oop.order;

public class Restauranttest {
	public static void main(String[] args) {
		 
		        // Instantiate the order class using the parameterized constructo
		        System.out.println("Creating a new Order object...");
		        order myOrder = new order("ORD001", "Alice Smith", "Laptop", 1200.50, 1);

		        // Print the Order object (this will implicitly call the toString() method)
		        System.out.println("\n--- Order Information ---");
		        System.out.println(myOrder);

		        // Demonstrate using setters to modify properties
		        System.out.println("\n--- Updating Order Information ---");
		        myOrder.setQuantity(2);
		        myOrder.setItemPrice(1150.00);
		        System.out.println("Updated Quantity and Item Price.");
		        System.out.println(myOrder);

		        // Demonstrate using the default constructor and then setters
		        System.out.println("\n--- Creating another Order using default constructor ---");
		        order anotherOrder = new order(); // Use 'order' (lowercase) here too
		        System.out.println(anotherOrder); // Initial state

		        anotherOrder.setOrderId("ORD002");
		        anotherOrder.setCustomerName("Bob Johnson");
		        anotherOrder.setItemName("External Hard Drive");
		        anotherOrder.setItemPrice(75.99);
		        anotherOrder.setQuantity(3);
		        System.out.println("\n--- Another Order (after setting properties) ---");
		        System.out.println(anotherOrder);

		        // Test invalid price and quantity
		        System.out.println("\n--- Testing invalid price and quantity ---");
		        myOrder.setItemPrice(-10.00); // This should print an error
		        myOrder.setQuantity(-1); // This should print an error
		        System.out.println(myOrder); // Price and quantity should remain unchanged due to validation
		    }

}
