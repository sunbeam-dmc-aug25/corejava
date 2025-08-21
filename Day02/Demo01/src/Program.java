import java.util.Scanner;


class Time {
    // fields -> variables declared inside the class
    int hr;
    int min;

    //methods -> a function declared inside the class
    void acceptTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hrs - ");
        hr = sc.nextInt();
        System.out.println("Enter the mins - ");
        min = sc.nextInt();
    }

    void displayTime() {
        System.out.println("Time - " + hr + " : " + min);// Time - 10:30
    }
}

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello");
        Time t1 = null; // Reference -> A varaibale of a class
        t1 = new Time(); // object of the class Time
        t1.acceptTime(); // 10:30
        t1.displayTime();

        Time in = new Time();
        in.acceptTime(); // 11:45
        in.displayTime();

        Time out = new Time();
        out.acceptTime(); // 10:45
        out.displayTime();

        int n1;
    }
}
