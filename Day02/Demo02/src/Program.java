
// Method Overloading
// Defining the multiple methods with same name but differnt signature
// Change in Signature means
// 1. Change in No of parameters
// 2. Change in Type of parameters
// 3. Change in order of parameters
// It is an example of Compile Time Polymorphism

class Arithmetic {
    void add(int n1, int n2)  // no of parmaters - 2
    {
        System.out.println("Addition - " + (n1 + n2));
    }

    void add(int n1, int n2, int n3) // no of paramaters - 3
    {
        System.out.println("Addition - " + (n1 + n2 + n3));
    }

    void square(int n) // type of paramater - int
    {
        System.out.println("Square - " + (n * n));
    }

    void square(double n) // type of paramater - double
    {
        System.out.println("Square - " + (n * n));
    }

    void division(int numerator, double denominator) // order of paramater - int,double
    {
        System.out.println("Division - " + (numerator / denominator));
    }

    void division(double numerator, int denominator) // order of paramater - double, int
    {
        System.out.println("Division - " + (numerator / denominator));
    }
}

public class Program {
    public static void main(String[] args) {
        Arithmetic a1 = new Arithmetic();
        a1.add(10, 20);
        a1.add(10, 20, 30);
        a1.square(5);
        a1.square(5.5);
        a1.division(10, 2.5);
        a1.division(10.5, 2);

        System.out.println();
        System.out.println(true);
        System.out.println(10);
        System.out.println("Hello");
    }
}
