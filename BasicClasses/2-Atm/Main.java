package com.atm.app;

public class Main {
    
    public static void main(String[] args) {
        
        // Mohmmad {4451238, 10000}
        Account a1 = new Account();
        
        // Belal {9563145, 100}
        Account a2 = new Account();
        
        // Ahmed {4451238, 500}
        Account a3 = new Account();
        
        a1.insert(4451238,"Mohmmad",10000);
        a1.deposit(12000);
        System.out.println(a1.withdrow(2000));
        System.out.println(a1.checkBalance());
        System.out.println(a1.toString());
        
        a2.insert(9563145,"Belal",100);
        a2.deposit(50);
        System.out.println(a2.withdrow(140));
        System.out.println(a2.checkBalance());
        System.out.println(a2.toString());
        
        a3.insert(4451238,"Ahmed",500);
        a3.deposit(550);
        System.out.println(a3.withdrow(10));
        System.out.println(a3.checkBalance());
        System.out.println(a3.toString());
    }
    
}