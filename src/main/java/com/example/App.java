package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Harness CI!");
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
