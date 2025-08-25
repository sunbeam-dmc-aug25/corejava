package com.sunbeam.p1;

public class BankAccount {
    private static int generateAccNo = 1000;
    private int accno;
    private String name;
    private double balance;

    {
        generateAccNo++;
        accno = generateAccNo;
    }

    public BankAccount() {
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Accno - " + accno);
        System.out.println("Name - " + name);
        System.out.println("Balance - " + balance);
    }

}
