package com.sunbeam.p1;

public class Program03 {

    public static void delay() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        class MyThread extends Thread {
            @Override
            public void run() {
                for (int i = 11; i <= 20; i++) {
                    delay();
                    System.out.println("MyThread - " + i);
                }
            }
        }

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 21; i <= 30; i++) {
                    delay();
                    System.out.println("MyRunnable - " + i);
                }
            }
        }
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        System.out.println("Thread t1 state before start - " + t1.getState());

        t1.start();
        t2.start();

        System.out.println("Thread t1 state after start - " + t1.getState());


        for (int i = 1; i <= 10; i++) {
            delay();
            System.out.println("Main - " + i);
        }

        try {
            t1.join(); //
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread t1 state after completion - " + t1.getState());

        System.out.println("Program Finished");
    }
}
