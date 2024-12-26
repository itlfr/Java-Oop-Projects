package com.atm.app;

public class Account {
    private int accountNo;
    private String name;
    private float amount;
    
    //New Account
    public void insert(int a, String n, float amt){
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }
    
    //Deposit new balance
    public void deposit(float amt){
        this.amount = this.amount + amt;
    }
    
    //Withdrow money
    public boolean  withdrow(float amt){
        if  (amt > amount){
            return false;
        } else{
            this.amount = this.amount - amt;
            return true;
        }
    }
    
    //Get user balance
    public float checkBalance(){
        return this.amount;
    }
    
    //To string
    public String toString(){
        return "Account{ Number: "+accountNo+",Name: " +name+",Amount: "+amount+"}";
    }
}