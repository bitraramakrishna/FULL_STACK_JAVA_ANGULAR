package com.wipro.mockitodemo;

import junit.framework.TestCase;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class OrderServiceTest extends TestCase {
	
    void placeOrder_shouldReturnSuccessful_whenOrderItemIsORD01() {
        
        OrderService mockOrderService = mock(OrderService.class);

        // 2. Define the behavior of the mocked method
        // When placeOrder("ORD-01") is called, it should return "successful"
        when(mockOrderService.placeOrder("ORD-01")).thenReturn("successful");

        // 3. Call the method on the mocked object
        String result = mockOrderService.placeOrder("ORD-01");

        // 4. Verify the return value using assertEquals
        assertEquals("successful", result, "The order placement result should be 'successful'");

        // 5. Verify that the placeOrder method was called exactly once with "ORD-01"
        verify(mockOrderService).placeOrder("ORD-01");

        // Optional: Verify that placeOrder was NOT called with a different argument
        verify(mockOrderService, never()).placeOrder("ORD-02");
    }

    
    void placeOrder_shouldReturnNull_whenOrderItemIsDifferent() {
        // Create a mock of the OrderService class
        OrderService mockOrderService = mock(OrderService.class);

        // No specific behavior defined for "ORD-02", so it will return null (default for mocks)
        String result = mockOrderService.placeOrder("ORD-02");

        // Verify the return value is null
        assertEquals(null, result, "The order placement result should be null for other items");

        // Verify that the placeOrder method was called exactly once with "ORD-02"
        verify(mockOrderService).placeOrder("ORD-02");
    }

}
