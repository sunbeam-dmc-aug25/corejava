public class Program01 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1; // Widening
        // process of converting narrower type into wider type
        // is called as widening

        double num3 = 10.20;
        int num4 = (int) num3; // Narrowing
        // process of converting wider type into narrow type
        // is called as narrowing
        // At the time of narrowing explicit typecasting is mandatory
    }
}
