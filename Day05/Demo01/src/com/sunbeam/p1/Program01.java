package com.sunbeam.p1;


public class Program01 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Anil", 10000);
        BankAccount a3 = new BankAccount("Mukesh", 20000);
        a1.displayAccountDetails();
        a2.displayAccountDetails();
        a3.displayAccountDetails();
    }
}
