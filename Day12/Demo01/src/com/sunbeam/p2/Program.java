package com.sunbeam.p2;

public class Program {

    public static void delay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1001, 10000);

        class DepositThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    a1.deposit(10000);
                    System.out.println("Balance - " + a1.balance);
                    delay();
                }
            }
        }

        class WithdrawThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    a1.withdraw(10000);
                    System.out.println("Balance - " + a1.balance);
                    delay();
                }
            }
        }
        DepositThread dt = new DepositThread();
        dt.start();
        WithdrawThread wt = new WithdrawThread();
        wt.start();

        try {
            dt.join();
            wt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance - " + a1.balance);

    }
}
