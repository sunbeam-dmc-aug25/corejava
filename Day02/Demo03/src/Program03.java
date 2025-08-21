public class Program03 {
    public static void main(String[] args) {
        String n1 = "10";
        String n2 = "20";

        // convert the String to int type
        int i1 = Integer.parseInt(n1); // unboxing
        int i2 = Integer.parseInt(n2); // unboxing
        System.out.println("Addition - " + (n1 + n2));
        System.out.println("Addition - " + (i1 + i2));
    }
}
