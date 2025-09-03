package com.sunbeam.p1;

public class Program04 {

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

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 21; i <= 27; i++) {
                    delay();
                    System.out.println("MyRunnable - " + i);
                }
            }
        }
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t1.setDaemon(true);
        
        t1.start();
        t2.start();


        for (int i = 1; i <= 5; i++) {
            delay();
            System.out.println("Main - " + i);
        }

        System.out.println("Program Finished");
    }
}
