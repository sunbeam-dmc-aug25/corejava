package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1;
        e1 = new Manager();
        ///e1 = new Salesman();

        e1.accept(sc);
        e1.display();

        if (e1 instanceof Manager) {
            Manager m = (Manager) e1;
            m.calculateTotalSalary();
        }
        if (e1 instanceof Salesman) {
            Salesman s = (Salesman) e1;
            s.totalSalaryofSalesman();
        }
    }
}
