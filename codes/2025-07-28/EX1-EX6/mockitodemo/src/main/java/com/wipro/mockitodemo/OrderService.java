package com.wipro.mockitodemo;

public class OrderService {
	 /**
     * Places an order for a given item.
     *
     * @param orderItem The item to be ordered.
     * @return A string indicating the result of the order placement, or null if unsuccessful by default.
     */
    public String placeOrder(String orderItem) {
        // Default implementation returns null
        System.out.println("Attempting to place order for: " + orderItem);
        return null;
    }
}
