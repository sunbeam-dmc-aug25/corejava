package p1;

import java.util.Scanner;

public class Time {
    int hr;
    int min;

    public void acceptTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hrs - ");
        hr = sc.nextInt();
        System.out.println("Enter the mins - ");
        min = sc.nextInt();
    }

    public void displayTime() {
        System.out.println("Time - " + hr + " : " + min);
    }
}
