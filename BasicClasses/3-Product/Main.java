package com.product.app;

public class Main {
    
    public static void main(String[] args) {
        
        // No arg constractor
        Product p = new Product();
        p.display();
        System.out.println("------------------------");
        
        // 5 args constractor
        Product p1 = new Product(
        "phone","iphone 15.",15000.0f,6,15.0f);
        p1.display();
        System.out.println("------------------------");
        
        // Add color constractor
        Product p2 = new Product(
        "phone","Galaxy a12 5f.",8000.0f,19,3.0f,"Blue");
        p2.display();
        System.out.println("------------------------");
        
        // Copy constractor
        Product p3 = new Product(p2);
        p3.display();
    }
}