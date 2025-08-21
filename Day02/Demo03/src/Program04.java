public class Program04 {
    public static void main(String[] args) {
        int n1 = 10; // Primitive type
        Integer i1; // Reference(Non Primitive) type
        i1 = new Integer(n1); // Boxing
        // converting the primitive type to non primitive type
        System.out.println("i1 - " + i1);
    }
}
