public class Program06 {
    public static void main(String[] args) {
        int n1 = 10; // primitive
//        Integer i1 = new Integer(n1); // Boxing
        Integer i1 = n1; // Auto-Boxing
        System.out.println("i1 - " + i1);

        Integer i2 = new Integer(20); // Non primitive
//        int n2 = i2.intValue(); // Unboxing
        int n2 = i2; // auto-unboxing
        System.out.println("n2 - " + n2);

    }
}
