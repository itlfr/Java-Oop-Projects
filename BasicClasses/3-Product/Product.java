package com.product.app;

//Product class
public class Product {
    
    // Private args
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    
    //add new arg ( color )
    private String color;
    
    // Now arg constractor
    public Product(){
        this.name = "no name";
        this.description = "no description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0.0f;
        this.color = "No color";
    }
    
    // Paramterize constractor
    // 5 paramters
    public Product(
    String n, String d, float p, int q, float di){
        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = q;
        this.discount = di;
    }
    
    // Constractor to add new arg color
    public Product(
    String n, String d, float p, int q, float di, String c){
        // Calling a previous constructor with 5 args
        this (n,d,p,q,di);
        this.color = c;
    }
    
    // Create copy constractor ( 6 args )
    public Product(Product obj){
        this (obj.name, obj.description, obj.price, obj.quantity, obj.discount, obj.color);
    }
    
    public void display(){
        System.out.println("Name = " + this.name);
        System.out.println(
        "Description = " + this.description);
        System.out.println("Price = " + this.price);
        System.out.println("Quantity = " + this.quantity);
        System.out.println("Discount = " + this.discount);
        System.out.println("Color = " + color);
    }
}