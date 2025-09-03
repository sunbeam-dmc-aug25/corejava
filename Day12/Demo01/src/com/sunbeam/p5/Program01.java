package com.sunbeam.p5;

public class Program01 {
    public static void delay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Object obj = new Object();

        class SunbeamThread extends Thread {
            @Override
            public void run() {
                String s = "sunbeam";
                synchronized (obj) {
                    for (int i = 0; i < s.length(); i++) {
                        System.out.print(s.charAt(i));
                        delay();
                    }
                }
            }
        }

        class InfotechThread extends Thread {
            @Override
            public void run() {
                String s = " infotech";
                synchronized (obj) {
                    for (int i = 0; i < s.length(); i++) {
                        System.out.print(s.charAt(i));
                        delay();
                    }
                }
            }
        }

        SunbeamThread st = new SunbeamThread();
        InfotechThread it = new InfotechThread();
        st.start();
        it.start();

    }
}
