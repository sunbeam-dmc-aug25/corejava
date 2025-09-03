package com.sunbeam.p1;

public class Program02 {

    public static void delay() {
        try {
            Thread.sleep(1000);
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

        Thread t1 = new MyThread();
        t1.start();

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 21; i <= 27; i++) {
                    delay();
                    System.out.println("MyRunnable - " + i);
                }
            }
        }

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        for (int i = 1; i <= 5; i++) {
            delay();
            System.out.println("Main - " + i);
        }

        try {
            t1.join(); //
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program Finished");
    }
}
