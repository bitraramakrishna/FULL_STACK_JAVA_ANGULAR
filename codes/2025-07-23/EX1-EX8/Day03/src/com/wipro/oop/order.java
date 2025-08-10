package com.wipro.oop;

public class order {
	 private String orderId;
	    private String customerName;
	    private String itemName;
	    private double itemPrice;
	    private int quantity;

	    /**
	     * Default constructor for the order class.
	     * Initializes properties with default values.
	     */
	    public order() {
	        this.orderId = "N/A";
	        this.customerName = "Unknown";
	        this.itemName = "Generic Item";
	        this.itemPrice = 0.0;
	        this.quantity = 0;
	    }

	    /**
	     * Parameterized constructor for the order class.
	     *
	     * @param orderId The unique ID of the order.
	     * @param customerName The name of the customer.
	     * @param itemName The name of the item ordered.
	     * @param itemPrice The price of a single item.
	     * @param quantity The quantity of the item.
	     */
	    public order(String orderId, String customerName, String itemName, double itemPrice, int quantity) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.itemName = itemName;
	        // Basic validation for non-negative price and quantity
	        this.itemPrice = (itemPrice >= 0) ? itemPrice : 0.0;
	        this.quantity = (quantity >= 0) ? quantity : 0;
	    }

	    // --- Getter Methods ---
	    public String getOrderId() {
	        return orderId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getItemName() {
	        return itemName;
	    }

	    public double getItemPrice() {
	        return itemPrice;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    /**
	     * Calculates the total amount for the order.
	     * @return The total order amount.
	     */
	    public double getTotalAmount() {
	        return this.itemPrice * this.quantity;
	    }

	    // --- Setter Methods ---
	    public void setOrderId(String orderId) {
	        this.orderId = orderId;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public void setItemPrice(double itemPrice) {
	        if (itemPrice >= 0) {
	            this.itemPrice = itemPrice;
	        } else {
	            System.err.println("Error: Item price cannot be negative. Price not updated.");
	        }
	    }

	    public void setQuantity(int quantity) {
	        if (quantity >= 0) {
	            this.quantity = quantity;
	        } else {
	            System.err.println("Error: Quantity cannot be negative. Quantity not updated.");
	        }
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Order Details:\n" +
	               "  Order ID: " + orderId + "\n" +
	               "  Customer: " + customerName + "\n" +
	               "  Item: " + itemName + "\n" +
	               "  Price per item: $" + String.format("%.2f", itemPrice) + "\n" +
	               "  Quantity: " + quantity + "\n" +
	               "  Total Amount: $" + String.format("%.2f", getTotalAmount());
	    }
}
