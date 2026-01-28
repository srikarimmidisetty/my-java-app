package com.example;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class IntegrationTest {
    private static App app;
    
    @BeforeClass
    public static void setUpClass() {
        app = new App();
        System.out.println("Integration Test Setup Complete");
    }
    
    @Test
    public void testWorkflow1() {
        // Simulate a workflow
        int step1 = app.add(100, 200);
        int step2 = app.multiply(step1, 2);
        int step3 = app.subtract(step2, 100);
        
        assertEquals(300, step1);
        assertEquals(600, step2);
        assertEquals(500, step3);
        assertTrue(app.isEven(step3));
    }
    
    @Test
    public void testWorkflow2() {
        // Another workflow
        int result = app.add(10, 20);
        result = app.multiply(result, 3);
        result = app.subtract(result, 50);
        
        assertEquals(40, result);
        assertTrue(app.isEven(result));
    }
    
    @Test
    public void testComplexScenario() {
        // Complex integration scenario
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (app.isEven(i)) {
                total = app.add(total, app.multiply(i, 2));
            } else {
                total = app.add(total, i);
            }
        }
        assertEquals(80, total);
    }
}
