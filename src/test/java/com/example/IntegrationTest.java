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
        int result = app.add(10, 20);
        result = app.multiply(result, 3);
        result = app.subtract(result, 50);
        
        assertEquals(40, result);
        assertTrue(app.isEven(result));
    }
    
    @Test
    public void testComplexScenario() {
        // FIXED: Changed logic or expected value
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (app.isEven(i)) {
                // Even numbers: i * 2
                total = app.add(total, app.multiply(i, 2));
            } else {
                // Odd numbers: just i
                total = app.add(total, i);
            }
        }
        // The calculation gives 85, not 80
        // 1 + 4 + 3 + 8 + 5 + 12 + 7 + 16 + 9 + 20 = 85
        assertEquals(85, total);  // CHANGED FROM 80 TO 85
    }
}
