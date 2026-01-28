package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AppTest {
    private App app;
    
    @Before
    public void setUp() {
        app = new App();
    }
    
    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-5, 5));
        assertEquals(-10, app.add(-5, -5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(1, app.subtract(5, 4));
        assertEquals(-9, app.subtract(1, 10));
        assertEquals(0, app.subtract(5, 5));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(20, app.multiply(4, 5));
        assertEquals(0, app.multiply(0, 100));
        assertEquals(-15, app.multiply(3, -5));
    }
    
    @Test
    public void testIsEven() {
        assertTrue(app.isEven(2));
        assertTrue(app.isEven(0));
        assertTrue(app.isEven(-4));
        assertFalse(app.isEven(3));
        assertFalse(app.isEven(-7));
    }
    
    @Test
    public void testAllOperations() {
        int sum = app.add(10, 5);
        int product = app.multiply(sum, 2);
        int difference = app.subtract(product, 10);
        
        assertEquals(15, sum);
        assertEquals(30, product);
        assertEquals(20, difference);
        assertTrue(app.isEven(difference));
    }
}
