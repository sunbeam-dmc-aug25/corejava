public class Program02 {
    public static void main(String[] args) {
        boolean status = true;
        // int n1 = (int) status; // NOT OK
        // boolean cannot be converted to any other type

        short n1 = 10;
        int n2 = n1;
        char ch = 'A';

        int n3 = ch;
        int n4 = 65;
        char ch2 = (char) n4;

        byte n5 = 65;
        char ch3 = (char) n5;

        char ch4 = 'a';
        byte n6 = (byte) ch4;

    }
}
