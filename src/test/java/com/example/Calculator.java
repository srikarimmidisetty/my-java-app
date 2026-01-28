package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
    private App app;
    
    @Before
    public void setUp() {
        app = new App();
    }
    
    @Test
    public void testAdditionBoundary() {
        // Boundary tests
        assertEquals(0, app.add(0, 0));
        assertEquals(Integer.MAX_VALUE, app.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, app.add(Integer.MIN_VALUE, 0));
    }
    
    @Test
    public void testMultiplicationBoundary() {
        assertEquals(0, app.multiply(0, Integer.MAX_VALUE));
        assertEquals(0, app.multiply(Integer.MIN_VALUE, 0));
        assertEquals(0, app.multiply(0, 0));
    }
    
    @Test
    public void testLargeNumberOperations() {
        // Test with large numbers
        int largeNumber = 1000000;
        assertEquals(largeNumber * 2, app.add(largeNumber, largeNumber));
        assertEquals(0, app.subtract(largeNumber, largeNumber));
    }
    
    @Test
    public void testEvenOddLargeNumbers() {
        assertTrue(app.isEven(1000000));
        assertFalse(app.isEven(999999));
        assertTrue(app.isEven(-1000000));
        assertFalse(app.isEven(-999999));
    }
    
    @Test(timeout = 1000)
    public void testPerformanceQuick() {
        // Quick performance test
        for (int i = 0; i < 1000; i++) {
            app.add(i, i + 1);
            app.multiply(i, i + 1);
            app.isEven(i);
        }
        assertTrue(true); // If we reach here, test passed
    }
}
