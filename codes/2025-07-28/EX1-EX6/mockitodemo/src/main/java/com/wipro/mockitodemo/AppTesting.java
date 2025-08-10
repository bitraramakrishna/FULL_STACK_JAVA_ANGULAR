package com.wipro.mockitodemo;


import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

public class AppTesting extends TestCase {
	/**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    void testGetGreeting() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
    }
}
