public class Program05 {
    public static void main(String[] args) {
        Integer i1; // Reference(Non Primitive) type
        i1 = new Integer(20);
        int n1 = i1.intValue(); // UnBoxing
        // converting the non primitive type to primitive type
        System.out.println("n1 - " + n1);
    }
}
